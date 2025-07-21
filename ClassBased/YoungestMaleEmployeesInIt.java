package ClassBased;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
import java.util.*;

class YoungestMaleEmployees {

    public static void main(String[] args) {
        List<Employee> employees = Employee.employeeList;

        Optional<Employee> employee = employees.stream()
                .filter(x -> x.getGender().equalsIgnoreCase("Male") && x.getDeptName().equalsIgnoreCase("IT"))
                .min(Comparator.comparingInt(Employee::getAge));

        employee.ifPresent(e -> System.out.println("Youngest male employee: " + e.getName() + ", Age: " + e.getAge()));
    }
}
