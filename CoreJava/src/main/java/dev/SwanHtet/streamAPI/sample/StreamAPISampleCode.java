package dev.SwanHtet.streamAPI.sample;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.SwanHtet.exception.unchecked.UnCheckCustom;
import dev.SwanHtet.streamAPI.helper.Employee;
import dev.SwanHtet.streamAPI.sample.StreamAPIOperations;
import lombok.Getter;
import lombok.SneakyThrows;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

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



}
