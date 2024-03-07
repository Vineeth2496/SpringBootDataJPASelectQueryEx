package com.SpringBootJDataJPA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBootJDataJPA.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	/*
	//@Query("FROM Employee e")
	@Query("SELECT e FROM Employee e")
	List<Employee> getAllEmps();
	
	@Query("SELECT e.empName FROM Employee e")
	List<String> getEmpNames();
	
	@Query("SELECT e.empName, e.empSal FROM Employee e")
	List<Object[]> getEmpNameAndSals();
	
	//=====================================
	*/
	//@Query("FROM Employee e")
		@Query("SELECT e FROM Employee e WHERE e.empId=?1")
		Employee getEmpById(Integer id);
		
		@Query("SELECT e.empName FROM Employee e WHERE e.empName=?1")
		List<String> getEmpNameByName(String name);
		
		@Query("SELECT e.empName, e.empSal FROM Employee e WHERE e.empSal=?1")
		Object getEmpNameAndSalsBySal(Double sal);
		
	//---where conditions-----
		
		@Query("SELECT e FROM Employee e WHERE e.empId in (:data)")
		List<Employee> getEmpsByIdIn(List<Integer> data);
		
		@Query("SELECT e FROM Employee e WHERE e.empId between :start and :end")
		List<Employee> getEmpsByIdBetween(Integer start, Integer end);
		
	//---- Native SQL -----
	
	@Query(value ="select ename from emptab", nativeQuery = true)
	List<Employee> getAllEmployeesBySql();
	
	@Query(value ="select * from emptab", nativeQuery = true)
	List<Employee> getAllEmployeesBySql2();
		
	@Query("UPDATE Employee SET empName=:a WHERE empSal=:b")
	@Modifying
	@Transactional
	Integer updateEmployeeNameBySal(String a, Double b);
	
	@Query("DELETE FROM Employee WHERE empSal>=:b")
	@Modifying
	@Transactional
	Integer deleteEmployeeBySal(Double b);
	
}
