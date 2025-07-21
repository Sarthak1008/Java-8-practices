package ClassBased;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
import java.util.*;


class PartitionBasedOnSalary {
	public static void main(String[] args) {
		List<Employee> employees = Employee.employeeList;

		Map<Boolean,List<Employee>> names = employees.stream().collect(Collectors.partitioningBy(x->x.getSalary()>60000));

		System.out.println("Employees with salary > 60000:");
		names.get(true).forEach(e ->
		                        System.out.println(e.getName() + " - " + e.getSalary()));

		// Print employees with salary <= 60000
		System.out.println("\nEmployees with salary <= 60000:");
		names.get(false).forEach(e ->
		                         System.out.println(e.getName() + " - " + e.getSalary()));
	}

}

