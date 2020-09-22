package com.project.soar.employee;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

	Employee findByEmpid(String empid);
	
	
//	@Query(value="SELECT e FROM public.employee e WHERE e.id=2")
//	Employee findById();
	
	
//	System.out.println(e);
	
	
	

}
