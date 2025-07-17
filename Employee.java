package ClassBased;

import java.util.Arrays;
import java.util.List;

class Employee {
    int id;
    String name;
    int age;
    String gender;
    String deptName;
    int yearOfJoining;
    long salary;
    String city;

    public Employee(int id, String name, int age, String gender, String deptName, int yearOfJoining, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.deptName = deptName;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public static final List<Employee> employeeList = Arrays.asList(
            new Employee(1, "Emma", 32, "Female", "HR", 2015, 48000),
            new Employee(2, "John", 28, "Male", "HR", 2018, 52000),
            new Employee(3, "Lily", 26, "Female", "IT", 2019, 68000),
            new Employee(4, "Bruce", 45, "Male", "IT", 2010, 89000),
            new Employee(5, "Sophia", 38, "Female", "Sales", 2012, 62000),
            new Employee(6, "David", 24, "Male", "IT", 2022, 58000),
            new Employee(7, "Mike", 29, "Male", "Sales", 2016, 61000),
            new Employee(8, "Jane", 31, "Female", "HR", 2017, 50000),
            new Employee(9, "Ethan", 41, "Male", "Finance", 2011, 92000),
            new Employee(10, "Riya", 27, "Female", "Finance", 2019, 55000));

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    // constructors, getters, setters, toString...
}
