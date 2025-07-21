package ClassBased;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
import java.util.*;

class DepartmentWiseEmployees {

    public static void main(String[] args) {
        List<Employee> employees = Employee.employeeList;
        Map<String, List<String>> map = employees.stream().collect(
                Collectors.groupingBy(x -> x.getDeptName(), Collectors.mapping(e -> e.getName(),
                        Collectors.toList())));
        map.forEach((dept, names) -> {
            System.out.println("Department: " + dept);
            System.out.println("Employees: " + names);
            System.out.println();
        });
    }
}
