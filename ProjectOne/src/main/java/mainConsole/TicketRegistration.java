package mainConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.model.Revemployee;
import com.revature.model.Ticket;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;
import com.revature.repository.TicketRepository;

public class TicketRegistration {
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

			if (loggedInEmployee.getRole().equals("associate")) {
				System.out.print("Amount: ");
				int amount = Integer.parseInt(scan.nextLine());

				int revemployeeId = loggedInEmployee.getRevemployeeId();

				System.out.print("Description: ");
				String description = scan.nextLine();

				Ticket ticket = new Ticket(1, "Pending", amount, revemployeeId, description);
				//tickets.add(ticket);
				ticketRepository.save(ticket);
				System.out.println(tickets);

			}
		} else {
			System.out.println("Wrong username or Wrong password");

		}

	}
}
