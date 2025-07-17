package ClassBased;

import java.util.List;
import java.util.Scanner;

public class EmployeeWhoJoinedAfterAYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to filter employees who joined after that year:");
        int year = scanner.nextInt();
        List<Employee> employees = Employee.employeeList;
        employees.stream().filter(e -> e.getYearOfJoining() >= year).forEach((e -> System.out.println(e.getName())));
    }
}
