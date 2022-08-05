package mainConsole;

import java.util.ArrayList;
import java.util.List;

import com.revature.model.Revemployee;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;

public class mainProgram {
	public static void main(String[] args) {
		RevemployeeRepository revemployeeRepository = new RevemployeeRepositoryImpl();
		List<Revemployee> revemployees = revemployeeRepository.findAllRevEmployees();
		System.out.println(revemployees);
	}
}
	