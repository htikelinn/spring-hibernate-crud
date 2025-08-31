package org.dos.hzl.spring_hibernate_crud.dao;

import java.util.List;

import org.dos.hzl.spring_hibernate_crud.model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> get() {
       Session cuSession = entityManager.unwrap(Session.class);
       Query<Employee> query = cuSession.createQuery("from Employee",Employee.class);
       List<Employee> list = query.getResultList();
       return list;
    }

    @Override
    public Employee get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void save(Employee employee) {
        Session cuSession = entityManager.unwrap(Session.class);
        cuSession.save(employee);
    }

    @Override
    public void delete(int id) {
        Session cuSession = entityManager.unwrap(Session.class);
        Employee employee = cuSession.get(Employee.class, id);
        cuSession.delete(employee);
    }

}
