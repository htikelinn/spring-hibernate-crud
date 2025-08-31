package org.dos.hzl.spring_hibernate_crud.service;

import java.util.List;

import org.dos.hzl.spring_hibernate_crud.model.Employee;

public interface EmployeeService {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
