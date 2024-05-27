package dev.SwanHtet.exception.checked;


public class ExampleUsage {
	public void  ageChecker(int age) throws UnderAgeException {
		if(age < 18) {
			throw new UnderAgeException("It is underage");
		}
		System.out.println("User is valid Age");
	}

	public  void registerUser(String username ,int age){
		try{
			ageChecker(age);
			System.out.println("Register Successful");
		}catch (UnderAgeException e){
			System.out.println("Error is " +e.getLocalizedMessage());
		}
	}

}
