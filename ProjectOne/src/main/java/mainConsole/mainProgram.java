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
		//List<Revemployee> revemployees = revemployeeRepository.findAllRevEmployees();
		//System.out.println(revemployees);
		
		Scanner scan = new Scanner(System.in);
		List<Revemployee> employeesList = new ArrayList<Revemployee>();
		Revemployee employee = new Revemployee(1,"Yaovi","Attidekou",2,"Fofo","123");
		employeesList.add(employee);
		String username = scan.nextLine();
		String password = scan.nextLine();
		
		if(employee.getUserName().equals( username) && employee.getPassword().equals(password)) {
			System.out.println("logged in");
		}else {
			System.out.println("Wrong username or Wrong password");
		}
		
		Revemployee newemployee = new Revemployee(1,"Yaovi","Attidekou",2,username, password);
		
		System.out.println(newemployee);
		
		
//		List<Ticket> ticketList = new ArrayList<Ticket>();
		Ticket ticket1 = new Ticket(30,"book");
//		ticketList.add(ticket1);

	
		System.out.println(ticket1.getAmount());
		System.out.println(ticket1.getDescription());
		System.out.println(ticket1);
//		System.out.println(ticketList.get(0));
//		System.out.println(ticketList);
//		int amount = scan.nextInt();
//		String description = scan.nextLine();
		
		if(ticket1.getAmount()>50) {
			System.out.println("Your ticket is denied");
		}else {
			System.out.print("Your ticket is approved");
		}
	}
}
	