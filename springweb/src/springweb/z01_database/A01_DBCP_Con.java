package springweb.z01_database;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class A01_DBCP_Con {
	// A01_DBCP_Con.getCon()
	public static Connection  getCon() throws SQLException{
		
		// Ŀ�ؼ� Ǯ�� ���� Ŀ�ؼ� ��������.
		Connection con=null;
		// jndi
		try {
			Context initCtx = new InitialContext();
			// initCtx���� lookup�޼��带 �̿��ؼ� "java:comp/env"�� �ش��ϴ� ��ü ȣ��.
			Context evnCtx = (Context)initCtx.lookup("java:comp/env");
		// Ŀ�ؼ� pool
			DataSource ds = (DataSource)evnCtx.lookup("jdbc/orcl");
			// jdbc/orcl�� ������ ����  WAS�ܿ��� ã�Ƽ� connection�� ������
			con=ds.getConnection();
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		



		return con;
	}
}
