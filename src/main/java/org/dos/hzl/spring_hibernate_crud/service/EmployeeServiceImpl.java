package org.dos.hzl.spring_hibernate_crud.service;

import java.util.List;

import org.dos.hzl.spring_hibernate_crud.dao.EmployeeDao;
import org.dos.hzl.spring_hibernate_crud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService  {

    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<Employee> get() {
        return employeeDao.get();
    }
    @Transactional
    @Override
    public Employee get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Transactional
    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
