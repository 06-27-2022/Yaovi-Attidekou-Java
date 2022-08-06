package mainConsole;

import java.util.List;
import java.util.Scanner;

import com.revature.model.Revemployee;
import com.revature.model.Ticket;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;
import com.revature.repository.TicketRepository;

public class ProcessTickets {
	public static void main(String[] args) {
		RevemployeeRepository revemployeeRepository = new RevemployeeRepositoryImpl();
		Revemployee loggedInEmployee = null;
		Scanner scan = new Scanner(System.in);
		TicketRepository ticketRepository = new TicketRepository();
		List<Ticket> tickets = ticketRepository.findAllTickets();

		List<Revemployee> employeesList = revemployeeRepository.findAllRevEmployees();
		System.out.println(tickets);

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

			if (loggedInEmployee.getRole().equals("manager")) {
				for (int i = 0; i < tickets.size(); i++) {
					System.out.println(tickets.get(i));
					System.out.print("Change ticket status to: ");
					String status = scan.nextLine();
					if (status.equals("deny")) {

						if (tickets.get(i).getStatus().equals("Approved")
								|| tickets.get(i).getStatus().equals("Denied")) {
							System.out.println("Your ticket is already processed");
						} else {
							System.out.println("Your ticket is denied");
							tickets.get(i).setStatus("Denied");
							ticketRepository.update(tickets.get(i));

						}
					} else if (status.equals("approve")) {
						if (tickets.get(i).getStatus().equals("Approved")
								|| tickets.get(i).getStatus().equals("Denied")) {
							System.out.println("Your ticket is already processed");
						} else if (tickets.get(i).getStatus().equals("Pending")) {
							tickets.get(i).setStatus("Approved");
							ticketRepository.update(tickets.get(i));
							System.out.println("Your ticket is approved");
						}
					}
				}
			} else {
				System.out.println("You are not a manager");
			}
		} else {
			System.out.println("Wrong username or Wrong password");

		}
	}
}
