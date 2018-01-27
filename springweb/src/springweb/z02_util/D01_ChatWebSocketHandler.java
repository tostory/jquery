package springweb.z02_util;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Controller("chatHandler")
public class D01_ChatWebSocketHandler extends TextWebSocketHandler{

		// websocketsession�� ���� 
	private Map<String, WebSocketSession> users= new ConcurrentHashMap<>();
	
	// ������ �̷������ ó��..
	public void afterConnectionEstablished(WebSocketSession session)throws Exception{
		log(session.getId()+" ����");
		users.put(session.getId(), session);
	}
	// ������ ���� ó��..
	public void afterConnectionClosed(WebSocketSession session,
			CloseStatus status)throws Exception{
		log(session.getId()+" ���� ����");
		users.remove(session.getId());
	}
	// �޽��� ���޽� ó��..
	protected void handleTextMessage(WebSocketSession session,
			TextMessage message)throws Exception{
		log(session.getId()+" ��: "+message.getPayload());
		for(WebSocketSession s:users.values()){
			s.sendMessage(message);
			log(s.getId()+" ��: "+message.getPayload());
		}
	}

	
	// �����߻�
	public void handleTransportError(WebSocketSession session, 
				Throwable exception)throws Exception{
		log(session.getId()+" ���� �߻�: "+ exception.getMessage());
	}
	// �α�ó��.
	private void log(String logmsg){
		System.out.println(new Date()+" : "+logmsg);
	}
}
