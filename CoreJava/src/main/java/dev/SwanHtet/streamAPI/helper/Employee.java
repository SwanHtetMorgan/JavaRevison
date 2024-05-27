package dev.SwanHtet.streamAPI.helper;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Employee {
	private String name;
	private int age;
	private String department;
	private int salary;
}
