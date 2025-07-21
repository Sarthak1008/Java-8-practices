package ClassBased;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
import java.util.*;


class AverageAgeOnGender {
	public static void main(String[] args) {
		List<Employee> employees = Employee.employeeList;

		Map<String, Double> avgAgeByGender = Employee.employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeByGender);
	}

}