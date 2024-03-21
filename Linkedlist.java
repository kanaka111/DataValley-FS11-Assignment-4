import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary;
    }
}

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(1, "Maha", "Manager", 60000));
        employeeList.add(new Employee(2, "Swathi", "Engineer", 55000));
        employeeList.add(new Employee(3, "Lakshmi", "Developer", 40000));
        employeeList.add(new Employee(4, "Seetha", "Designer", 55000));

        System.out.println("Original List:");
        displayList(employeeList);

        Collections.sort(employeeList, Comparator.comparing(Employee::getName));
        System.out.println("\nSorted List based on Name:");
        displayList(employeeList);

        Collections.sort(employeeList, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("\nSorted List based on Salary:");
        displayList(employeeList);
    }

    public static void displayList(LinkedList<Employee> list) {
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}
