package mainConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.model.Revemployee;
import com.revature.model.Ticket;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;

public class mainProgram {
	public static void main(String[] args) {
		RevemployeeRepository revemployeeRepository = new RevemployeeRepositoryImpl();
		 
		

		Scanner scan = new Scanner(System.in);
		List<Revemployee> employeesList = revemployeeRepository.findAllRevEmployees();
		System.out.println(employeesList);
		//Revemployee employee = new Revemployee(2, "Angela", "Baba", 2, "Fofo", "123", "associate");
		//Revemployee manager = new Revemployee(1, "Yaovi", "Attidekou", 6, "Thomass", "senior", "manager");
		Revemployee loggedInEmployee = null;

		//employeesList.add(manager);
		//employeesList.add(employee);
		System.out.print("Username: ");
		String username = scan.nextLine();
		System.out.print("Password: ");
		String password = scan.nextLine();

		for (int i = 0; i < employeesList.size(); i++) {
			if (employeesList.get(i).getUserName().equals(username)
					&& employeesList.get(i).getPassword().equals(password)) {
				loggedInEmployee = employeesList.get(i);
				break;
			}
		}
		if (loggedInEmployee != null) {
			System.out.println("logged in");

			
			

			List<Ticket> tickets = new ArrayList<Ticket>();
			if (loggedInEmployee.getRole().equals("associate")) {
				System.out.print("Amount: ");
				int amount = Integer.parseInt(scan.nextLine());

				
				int revemployeeId = loggedInEmployee.getRevemployeeId();

				System.out.print("Description: ");
				String description = scan.nextLine();

				Ticket ticket = new Ticket(1, "Pending", amount, revemployeeId, description);
				tickets.add(ticket);
				System.out.println(tickets);

			}

			
			for (int i = 0; i < tickets.size(); i++) {
				if (loggedInEmployee.getRole().equals("manager")) {
					System.out.print("Change ticket status to: ");
					String status = scan.nextLine();
					if (status.equals("deny")) {

						if (tickets.get(i).getStatus().equals("Approved")
								|| tickets.get(i).getStatus().equals("Denied")) {
							System.out.println("Your ticket is already processed");
						} else {
							System.out.println("Your ticket is denied");
							tickets.get(i).setStatus("Denied");

						}
						if (status.equals("approve")) {
							if (tickets.get(i).getStatus().equals("Approved")
									|| tickets.get(i).getStatus().equals("Denied")) {
								System.out.println("Your ticket is already processed");
							} else if (tickets.get(i).getStatus().equals("Pending")) {
								tickets.get(i).setStatus("Approved");
								System.out.println("Your ticket is approved");
								System.out.println(tickets.get(i).getStatus());
							}

							else {
								System.out.println("You are not a manager");
							}

						}

					}

				}
			}
		} else {
			System.out.println("Wrong username or Wrong password");

		}

	}
}