package mainConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.model.Revemployee;
import com.revature.model.Ticket;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;

public class Register {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Username: ");
		String username = scan.nextLine();
		System.out.print("Password: ");
		String password = scan.nextLine();

		
		RevemployeeRepository revemployeeRepository = new RevemployeeRepositoryImpl();
		List<Revemployee> employeesList = revemployeeRepository.findAllRevEmployees();
		
		boolean usernameTaken = false;
		for (int i = 0; i < employeesList.size(); i++) {
			if (employeesList.get(i).getUserName().equals(username)) {
				System.out.println("Your username is already used by other");
				usernameTaken = true;
			}
		}
		if(!usernameTaken) {
			System.out.print("Firstname: ");
			String firstName = scan.nextLine();
			System.out.print("LastName: ");
			String lastName = scan.nextLine();
			Revemployee newemployee = new Revemployee(1, firstName, lastName, 2, username, password,
					"associate");
			revemployeeRepository.save(newemployee);
			//employeesList.add(newemployee);
			System.out.println(newemployee);
		}
		System.out.println(employeesList);
		
		
		
		

		
		
	}
}
