package dev.SwanHtet.streamAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.SwanHtet.exception.unchecked.UnCheckCustom;
import dev.SwanHtet.streamAPI.helper.Employee;
import lombok.Getter;
import lombok.SneakyThrows;

import java.io.File;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

@Getter
public class StreamAPISampleCode implements StreamAPIOperations {



	@Override
	public List<String> filterAndTransformStrings(List<String> inputStrings) {
		return inputStrings.stream()
				.filter(string -> string.length() < 5)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
	}

	@Override
	public int processIntegers(List<Integer> inputIntegers) {
		return inputIntegers.stream()
				.filter(num -> num % 2 != 0)
				.map(remaining -> remaining * 3)
				.mapToInt(Integer::intValue)
				.sum();
	}

	@Override
	public double calculateAverageLength(List<String> inputStrings) {
		return inputStrings.stream()
				.filter(string -> string.length() > 3)
				.mapToInt(String::length)
				.average()
				.orElse(0.0);
	}

	@Override
	public Map<Integer, List<String>> groupStringsByLength(List<String> inputStrings) {
		return inputStrings.stream()
				.collect(Collectors.groupingBy(String::length));
	}

	@SneakyThrows
	@Override
	public Object[] processingEmployeeDate() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Employee[] employees = objectMapper.readValue(new File("/Users/swanhtetmac/Desktop/spring-and-spring-boot-example/JavaRevison/CoreJava/src/main/resources/json/employee.json"), Employee[].class);
			for(Employee employee: employees){
				System.out.println(employee.toString());
			}
			return employees;
		}catch (UnCheckCustom e){
			throw  new UnCheckCustom("Failed to load data from Json File");
		}
	}

}
