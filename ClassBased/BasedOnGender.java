package ClassBased;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
import java.util.*;

class BasedOnGender {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employeeList;
        Map<Boolean,List<Employee>> map = employees.stream().collect(
            Collectors.partitioningBy(x-> x.getGender().equalsIgnoreCase("Male")));
            System.out.println(map.get(true));
            System.out.println(map.get(false)); 
			
			Map<String, Long> genderCount = Employee.employeeList.stream()
			.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
			System.out.println(genderCount);
    }
}