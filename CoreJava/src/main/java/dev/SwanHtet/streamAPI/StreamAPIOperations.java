package dev.SwanHtet.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface StreamAPIOperations {

	/**
	 * You have a list of names and you want to filter out names that are shorter than 5 characters,
	 * transform the remaining names to uppercase, and collect them into a new list.
	 *
	 * @param inputStrings the list of names
	 * @return the list of filtered and transformed names
	 */
	List<String> filterAndTransformStrings(List<String> inputStrings);

	/**
	 * You have a list of integers, and you want to filter out the even numbers,
	 * multiply the remaining odd numbers by 3, and then find the sum of these transformed numbers.
	 *
	 * @param inputIntegers the list of integers
	 * @return the sum of transformed odd numbers
	 */
	int processIntegers(List<Integer> inputIntegers);

	/**
	 * You have a list of strings representing words, and you want to find the average length
	 * of words that are longer than 3 characters.
	 *
	 * @param inputStrings the list of words
	 * @return the average length of words longer than 3 characters
	 */
	double calculateAverageLength(List<String> inputStrings);

	/**
	 * You have a list of strings, and you want to group them based on their length.
	 *
	 * @param inputStrings the list of strings
	 * @return a map where keys are the lengths of strings and values are lists of strings with the same length
	 */
	Map<Integer, List<String>> groupStringsByLength(List<String> inputStrings);
	/**
	 * Problem: Processing Employee Data
	 *
	 * You have a list of employee objects, each containing information such as name, age, department, and salary. You need to perform various operations on this data, such as:
	 * Read the Data from the File
	 * Calculate the total salary expenditure for all employees in a specific department.
	 * Find the average age of employees in each department.
	 * Identify the highest-paid employee in each department.
	 * Filter out employees who are younger than a certain age.
	 * Group employees by department and then sort them by salary within each department.
	 */
	Object[] processingEmployeeDate();
}
