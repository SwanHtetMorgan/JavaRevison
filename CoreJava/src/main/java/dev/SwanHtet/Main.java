package dev.SwanHtet;


import dev.SwanHtet.exception.ExampleUsage;
import dev.SwanHtet.streamAPI.sample.StreamAPISampleCode;

import java.util.Arrays;
import java.util.List;

public class Main {



	public static void main(String[] args) {
		ExampleUsage usage = new ExampleUsage();
		usage.registerUser("SwanHet", 12);
		List<String> inputList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pear", "pineapple");
	}

}
