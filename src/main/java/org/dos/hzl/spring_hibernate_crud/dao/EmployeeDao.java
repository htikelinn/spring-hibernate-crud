package org.dos.hzl.spring_hibernate_crud.dao;

import java.util.List;

import org.dos.hzl.spring_hibernate_crud.model.Employee;

public interface EmployeeDao {
    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);


}
