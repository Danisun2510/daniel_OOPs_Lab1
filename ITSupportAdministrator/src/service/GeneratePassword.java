package service;

import java.util.Random;

public class GeneratePassword   {
	public String generatePassword() {
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String characters="!@#$%^&*_=+-/.?/<>)";
		String value=capitalLetters+smallLetters+numbers+characters;
		Random random=new Random();
		String password="";
		for(int i=0;i<8;i++) {
			password+=String.valueOf(value.charAt(random.nextInt(value.length())));
		}
		return password;
	}

}
