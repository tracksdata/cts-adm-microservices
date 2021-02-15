package com.cts.product;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.DepartmentDao;
import com.cts.product.dao.EmployeeDao;
import com.cts.product.entity.Department;
import com.cts.product.entity.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		EmployeeDao empDao = ac.getBean(EmployeeDao.class);
		DepartmentDao deptDao = ac.getBean(DepartmentDao.class);

		// Department d1 = deptDao.findById(6).orElse(null);
		Department d1 = new Department();
		
		d1.setDeptName("HR");
		d1.setLocation("Chennai");

		Employee e1 = new Employee();
		e1.setEmpName("Ozvitha");
		e1.setDesignation("Developer");
		e1.setSalary(34764);
		// e1.setDept(d1);

		Employee e2 = new Employee();
		e2.setEmpName("Praveen");
		e2.setDesignation("Trainer");
		e2.setSalary(348763);
		// e2.setDept(d1);

		Employee e3 = new Employee();
		e3.setEmpName("Bucky Wall");
		e3.setDesignation("Tester");
		e3.setSalary(384634);
		// e3.setDept(d1);

		d1.getEmps().add(e1);
		d1.getEmps().add(e2);
		d1.getEmps().add(e3);

		deptDao.save(d1);

		 empDao.saveAll(Arrays.asList(e1,e2,e3));

		deptDao.save(d1);
		
		//Department dept = deptDao.findById(1).orElse(null);
		/*
		
		System.out.println(dept.getDeptId());
		System.out.println(dept.getDeptName());
		System.out.println(dept.getLocation());
		
		for(Employee emp:dept.getEmps()) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println(emp.getDesignation());
			System.out.println("-----------------------------");
		}
		
		*/

		/*
		//Employee emp = empDao.findById(18).orElse(null);

		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDesignation());

		System.out.println("Dept ID: " + emp.getDept().getDeptId());
		System.out.println("Name: " + emp.getDept().getDeptName());
		System.out.println("Location: " + emp.getDept().getLocation());
		
		*/

	}

}
