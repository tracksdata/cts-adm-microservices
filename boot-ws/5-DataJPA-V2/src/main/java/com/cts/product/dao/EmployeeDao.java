package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	// DSL Domain specific language

	List<Employee> findEmployeeByEmpNameLike(String name);
	List<Employee> findEmployeeBySalaryGreaterThanEqual(double salary);
	List<Employee> findEmployeeByEmpNameLikeAndSalaryGreaterThanEqual(String name,double salary);
	List<Employee> findEmployeeByEmpNameLikeAndSalaryGreaterThanEqualAndDesignationLike(String name,double salary,String designation);
	
	

}
