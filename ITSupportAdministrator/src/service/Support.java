package service;

import iCredentials.Credentials;
import model1.Employee;


public class Support implements Credentials {


	@Override
	public String generateEmailAddress(String firstName, String lastName, String dept) {
		
		
			return firstName+lastName+"@"+dept+".abc.com";
		
	}

	@Override
	public String generatePassword() {
		GeneratePassword pass=new GeneratePassword();
		return pass.generatePassword();
	}

	@Override
	public void showCredentials(Employee emp) {
		
		System.out.println("Email--->"+emp.getEmail());
		System.out.println("Password--->"+emp.getPassword());
		//Email ---> harshitchoudary@tech.abc.com
	//	Password ---> 181E@wFT
		
	}

	
	
}
