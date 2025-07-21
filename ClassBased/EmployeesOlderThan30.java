package ClassBased;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
import java.util.*;


 class EmployeesOlderThan30 {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employeeList;

         List<String> names = employees.stream().filter(x->x.getAge()>30).map(Employee::getName).collect(Collectors.toList());
            
            System.out.println(names);
        }

    }
