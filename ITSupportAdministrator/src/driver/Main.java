package driver;

import java.util.Scanner;
import iCredentials.Credentials;
import service.Support;
import model1.Employee;


public class Main {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		String password=null;
		String email=null;
	
		Scanner sc=new Scanner(System.in);
		Credentials cred=new Support();
		System.out.println("Enter your first name");
		firstName=sc.nextLine();
		System.out.println("Enter your last name");
		lastName=sc.nextLine();
		Employee emp=new Employee(firstName,lastName);
		int opt;
		
			System.out.println("Please enter the department from the following");
			  System.out.println("1.Technical");
			  System.out.println("2.Admin");
			  System.out.println("3.Human Resource");
			  System.out.println("4.legal");
			  opt=sc.nextInt(); 
			  switch(opt) {
			  case 1: {
				  email=cred.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "tech");
				  password=cred.generatePassword();
				  break;
			  }
			  case 2: {
				  email=cred.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "admin");
				  password=cred.generatePassword();
				  break;
			  }
			  case 3: {
				  email=cred.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "hr");
				  password=cred.generatePassword();
				  break;
			  }
			  case 4: {
				  email=cred.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "legal");
				  password=cred.generatePassword();
				  break;
			  }
			  default:
				  System.out.println("Invalid option");
				  break;
			  }
									
		
		
		emp.setEmail(email);
		emp.setPassword(password);
		System.out.println("Dear "+firstName+"  your generated credentials are as follows");
		cred.showCredentials(emp);
		sc.close();
	}
}
