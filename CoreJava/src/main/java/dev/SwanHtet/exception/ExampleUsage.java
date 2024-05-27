package dev.SwanHtet.exception;


import dev.SwanHtet.exception.checked.UnderAgeException;
import dev.SwanHtet.exception.unchecked.UnCheckCustom;

import java.util.regex.Pattern;

public class ExampleUsage {

	private static final Pattern emailPattern = Pattern.compile( "^[A-Za-z0-9+_.-]+@(.+)$");

	public void  ageChecker(int age) throws UnderAgeException {
		if(age < 18) {
			throw new UnderAgeException("It is underage");
		}
		System.out.println("User is valid Age");
	}

	public void emailValidation(String email){
		if(!emailPattern.matcher(email).matches()){
			throw  new RuntimeException("Invalid email format" + email);
		}
		System.out.println("Valid Email");
	}


	public  void registerUser(String username ,int age){
		try{
			ageChecker(age);
			System.out.println("Register Successful");
		}catch (UnderAgeException e){
			System.out.println("Error is " +e.getLocalizedMessage());
		}
	}
	public  void registerUser(String username ,int age, String email ){
		try{
			emailValidation(email);
			System.out.println("Register Successful");
		}catch (UnCheckCustom e){
			System.out.println("Error is " +e.getLocalizedMessage());
		}
	}



}
