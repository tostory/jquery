package springweb.c01_database.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.z01_dto.Emp;
import springweb.z01_dto.EmpMulti;

@Repository
public interface A01_EmpRep {
//	xml�� �ִ� id���� ���� ���� ��Ģ���� mapping
//	id="��Ű����.�������̽���.�޼����
//	id="springweb.c01_database.repository.A01_EmpRep.emplist"
//	�����ϴ� data�ִ� VO : Emp sch
//	parameterType="springweb.z01_dto.Emp"
//	������ ��� ó�� ArrayList<VO>
//	
	public ArrayList<Emp> emplist(Emp sch);
//	return : Emp  �Է� : empno(int)
//	id : empOne
//	resultType="emp"
//	parameterType="int"
	public Emp empOne(int empno);
/*  return : void   �Է� : Emp
 * 	id : empUpdate
 *  parameterType: emp 
 * */	
	public void empUpdate(Emp upt);
/*  ename, job�� ���� ���� ��Ȯ�� ���� ���Ͽ� ������ �ε�ó��
 * */	
	public ArrayList<Emp> empList02(Emp sch);
	
// �޿��� ���� �μ� �ε� ���� SQL
	public ArrayList<Emp> empList03(Emp sch);
	
//	arraylist deptno ��Ƽ ���� ������ ó��..
	public ArrayList<Emp> empMultiList(EmpMulti sch);
	
	
}
