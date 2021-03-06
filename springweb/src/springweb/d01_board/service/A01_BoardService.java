package springweb.d01_board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.d01_board.repository.A01_BoardDao;
import springweb.d01_board.vo.Board;
import springweb.d01_board.vo.Board_Sch;

@Service
public class A01_BoardService {
	@Autowired(required=false)
	private A01_BoardDao dao;

	public void insertBoard(Board ins){
		dao.insertBoard(ins);
	}
	public ArrayList<Board> listBoard(Board_Sch sch){
//		총데이터 건수.(DB에서 로딩)
		sch.setCount(dao.totCnt(sch));
//		한 페이지에서 나타날 데이터 건수..
//		초기 0 ==> 5
		if(sch.getPageSize() == 0){
			sch.setPageSize(5);
		}
//		총 페이지수 [1][2][3]  총데이터건수/페이지가 나타날 데이터 건수
//		20 ---> 4page  23 --> 5page로 처리를 위해 올림 처리..
		sch.setPageCount((int)Math.ceil(sch.getCount()/(double)sch.getPageSize()));
//		현재 클릭한 page 번호..
//		초기 0 ==> 1
		if(sch.getCurPage()==0){
			sch.setCurPage(1);
		}
//		시작번호 : 현재페이지-1 * 페이지크기 +1
		sch.setStart((sch.getCurPage()-1)*sch.getPageSize()+1);
//		마지막번호
		sch.setEnd(sch.getCurPage()*sch.getPageSize());
		
		return dao.listBoard(sch);
	}	
	public Board getBoard(int no){
		return dao.getBoard(no);
	} 
	// 상세화면 호출시, 조회수를 update,
	//  하나의 데이터를 가져오는 처리.
	public Board detailBoard(int no){
		// readCount를 update 처리..
		dao.uptBoardCnt(no);
		
		// 하나의 데이터를 가져올 부분
		return getBoard(no);
	}
	
	public Board getReBoard(int no){
		Board reboard= dao.getBoard(no);
			// 답글에 refno값으로 기존글의 no값을 할당하여,
			// 답글을 등록시, refno에 값이 있도록 처리..
			reboard.setRefno(no);
			reboard.setSubject("RE:"+reboard.getSubject());
			reboard.setContent("\n\n\n\n====이전내용===\n"
							+reboard.getContent());
	
		return reboard;
	} 	
	
	
}
