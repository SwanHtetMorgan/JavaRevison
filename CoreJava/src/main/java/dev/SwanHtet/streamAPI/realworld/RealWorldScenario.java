package dev.SwanHtet.streamAPI.realworld;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.SwanHtet.exception.unchecked.UnCheckCustom;
import dev.SwanHtet.streamAPI.helper.Employee;
import lombok.SneakyThrows;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class RealWorldScenario {

	private static final String FILE_PATH = "/Users/swanhtetmac/Desktop/spring-and-spring-boot-example/JavaRevison/CoreJava/src/main/resources/json/employee.json";

	public void processEmployeeData() {
		try {
			Employee[] employees = new FileHandler().readEmployeesFromJson();
			Map<String, List<Integer>> dataMap = new DataProcessor().extractData(employees);
			new DataProcessor().printTotalSalary(dataMap.get(DataProcessor.SALARIES));
			new DataProcessor().printAverageAge(dataMap.get(DataProcessor.AGE));
		} catch (UnCheckCustom e) {
			throw new UnCheckCustom("Failed to process employee data", e);
		}
	}

	private static class FileHandler {

		@SneakyThrows
		public Employee[] readEmployeesFromJson() {
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.readValue(new File(FILE_PATH), Employee[].class);
		}
	}


	public static void main(String[] args) {
		RealWorldScenario scenario = new RealWorldScenario();
		scenario.processEmployeeData();
	}


	private static class DataProcessor {
		public static final String SALARIES = "salaries";
		public static final String AGE = "age";

		public Map<String, List<Integer>> extractData(Employee[] employees) {
			List<Integer> salaries = new ArrayList<>();
			List<Integer> ages = new ArrayList<>();
			for (Employee employee : employees) {
				salaries.add(employee.getSalary());
				ages.add(employee.getAge());
			}
			Map<String, List<Integer>> dataMap = new HashMap<>();
			dataMap.put(SALARIES, salaries);
			dataMap.put(AGE, ages);
			return dataMap;
		}

		public void printTotalSalary(List<Integer> salaries) {
			int totalSalary = salaries.stream().mapToInt(Integer::intValue).sum();
			System.out.println("Total salary: " + totalSalary);
		}

		public void printAverageAge(List<Integer> ages) {
			double averageAge = ages.stream().mapToInt(Integer::intValue).average().orElse(0);
			System.out.println("Average age: " + averageAge);
		}
	}
}
