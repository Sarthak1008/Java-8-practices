package ClassBased;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
import java.util.*;


 class NumberOfEmployeesInEachDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employeeList;

         Map<String,Long> map = employees.stream().collect(
            Collectors.groupingBy(x-> x.getDeptName(),Collectors.counting()));
            
            
             map.forEach((dept, names) -> {
            System.out.println("Department: " + dept);
            System.out.println("Employees: " + names);
            System.out.println();
        });

    }
}
