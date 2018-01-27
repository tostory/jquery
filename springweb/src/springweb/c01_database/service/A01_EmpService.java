package springweb.c01_database.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.c01_database.repository.A01_EmpRep;
import springweb.z01_dto.Emp;
import springweb.z01_dto.EmpMulti;

@Service
public class A01_EmpService {
	@Autowired(required=false)
	private A01_EmpRep dao;

	
	public ArrayList<Emp> empList(Emp sch){
		
		if(sch.getEname()==null){
			sch.setEname("");
		}
		return dao.emplist(sch);
	}
	public ArrayList<Emp> empList02(Emp sch){
		return dao.empList02(sch);
	}
	
	public Emp empOne(int empno){
		// �����Ͻ� ���� ó��..
		return dao.empOne(empno);
	}	
	public void empUpdate(Emp upt){
		dao.empUpdate(upt);
	}

	public ArrayList<Emp> empMultiList(EmpMulti sch){
		
		return dao.empMultiList(sch);
	}
}
