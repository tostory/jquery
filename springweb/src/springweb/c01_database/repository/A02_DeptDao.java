package springweb.c01_database.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.z01_dto.Dept;

@Repository
public interface A02_DeptDao {
//	springweb.c01_database.repository.A02_DeptDao.deptList
	public ArrayList<Dept> deptList();
	public Dept deptOne(int deptno);	
/*
update dept
set dname='�λ�',
loc='������'
where deptno=50
return ��X :resultType, resultMap X
id : updateDept
parameterType : dept
 * */	
	public void updateDept(Dept upt);
	
}
