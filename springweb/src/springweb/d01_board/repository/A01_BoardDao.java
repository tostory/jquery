package springweb.d01_board.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.d01_board.vo.Board;
import springweb.d01_board.vo.Board_Sch;
//  springweb.d01_board.repository.A01_BoardDao
@Repository
public interface A01_BoardDao {
	public void insertBoard(Board ins);
//	ArrayList<Board> listBoard(Board_Sch sch)
	public ArrayList<Board> listBoard(Board_Sch sch);
//	총건수  
	public int totCnt(Board_Sch sch);
	
	public Board getBoard(int no);
//	상세화면 조회시, 조회수 +1
	public void uptBoardCnt(int no);
	
	
	
}
