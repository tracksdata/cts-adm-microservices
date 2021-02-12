package com.cts.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{}
