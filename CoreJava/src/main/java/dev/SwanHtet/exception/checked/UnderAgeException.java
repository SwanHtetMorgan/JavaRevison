package dev.SwanHtet.exception.checked;

public class UnderAgeException extends  Exception {

	public UnderAgeException() {


	}

	public  UnderAgeException(String message){
		super(message);
	}

	public UnderAgeException(String message, Throwable throwable){
		super(message, throwable);
	}

}
