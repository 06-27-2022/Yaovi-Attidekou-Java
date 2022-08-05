package mainConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.model.Revemployee;
import com.revature.model.Ticket;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;

public class mainProgram2 {
	public static void main(String[] args) {
		RevemployeeRepository revemployeeRepository = new RevemployeeRepositoryImpl();
		// List<Revemployee> revemployees = revemployeeRepository.findAllRevEmployees();
		// System.out.println(revemployees);

		Scanner scan = new Scanner(System.in);
		List<Revemployee> employeesList = new ArrayList<Revemployee>();
		Revemployee employee = new Revemployee(1, "Yaovi", "Attidekou", 2, "Fofo", "123", "associate");
		Revemployee manager = new Revemployee(3, "Thomas", "SENOIR", 6, "Thomass", "senior", "manager");
		Revemployee loggedInEmployee = null;
		
		employeesList.add(manager);
		employeesList.add(employee);
		System.out.print("Username: ");
		String username = scan.nextLine();
		System.out.print("Password: ");
		String password = scan.nextLine();

		for (int i = 0; i < employeesList.size(); i++) {
			if (employeesList.get(i).getUserName().equals(username) && employeesList.get(i).getPassword().equals(password)) {
				loggedInEmployee = employeesList.get(i);
				break;
			} 
		}
		if(loggedInEmployee != null) {
			System.out.println("logged in");
		}else {
			System.out.println("Wrong username or Wrong password");
			
		}

		/*
		 * for (int i = 0; i < employeesList.size(); i++) { if
		 * (employeesList.get(i).getUserName().equals(username)) {
		 * System.out.println("Your username is already used by other"); break; } else {
		 * Revemployee newemployee = new Revemployee(1, "Yaovi", "Attidekou", 2,
		 * username, password, "associate"); employeesList.add(newemployee); break; } }
		 * System.out.println(employeesList);
		 */
		
		List<Ticket> tickets = new ArrayList<Ticket>(); 
		if(loggedInEmployee.getRole().equals("associate")) {
			 System.out.print("Amount: ");
			 int amount = Integer.parseInt(scan.nextLine());
			 
			 System.out.print("Description: ");
			 String description = scan.nextLine();
			 
			 Ticket ticket = new Ticket(amount, description, "Pending"); 
			 tickets.add(ticket);
			 System.out.println(tickets);
			 
		}
		 
		
		System.out.print("Change ticket status to: ");
		String status = scan.nextLine();
		
		if (loggedInEmployee.getRole().equals("manager")) {
			if (status.equals("deny")) {

				if (tickets.get(0).getStatus().equals("Approved") || tickets.get(0).getStatus().equals("Denied")) {
					System.out.println("Your ticket is already processed");
				} else {
					System.out.println("Your ticket is denied");
					tickets.get(0).setStatus("Denied");
				}
			} else if (status.equals("approve")) {
				if (tickets.get(0).getStatus().equals("Approved") || tickets.get(0).getStatus().equals("Denied")) {
					System.out.println("Your ticket is already processed");
				} else if (tickets.get(0).getStatus().equals("Pending")) {
					tickets.get(0).setStatus("Approved");
					System.out.println("Your ticket is approved");
					System.out.println(tickets.get(0).getStatus());
				}
			}
		
		}else {
			System.out.println("You are not a manager");
		}
		

	}

}
