package com.revature.repository;
import java.util.List;
import com.revature.model.*;

public interface RevemployeeRepository {
	List<Revemployee> findAllRevEmployees();
	void save(Revemployee revemployee);
	void update(Revemployee revemployee);
    Revemployee findById(int id);
}
