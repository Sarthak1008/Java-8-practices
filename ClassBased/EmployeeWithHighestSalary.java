package ClassBased;

import java.util.Comparator;
import java.util.List;

public class EmployeeWithHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employeeList;

        employees.stream()
                .max(Comparator.comparingLong(e -> e.getSalary()))
                .ifPresent(e -> System.out.println(e.getName()));
    }
}