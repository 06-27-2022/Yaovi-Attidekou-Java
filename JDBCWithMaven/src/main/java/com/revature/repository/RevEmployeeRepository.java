package com.revature.repository;

import java.util.List;

import com.revature.model.RevEmployee;

public interface RevEmployeeRepository {
    List<RevEmployee> findAllRevEmployees();
    void save(RevEmployee revEmployee);
    void update(RevEmployee revEmployee);
    RevEmployee findById(int id);
    
    
}
