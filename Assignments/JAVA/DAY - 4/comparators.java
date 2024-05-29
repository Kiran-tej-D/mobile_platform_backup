/* Task 5: Iterators and Comparators

Write a custom Comparator to sort a list of Employee objects by their salary 
and then by name if the salary is the same.*/

package TASK;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nSalary = " + salary;
    }
}
class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int salaryComparison = Double.compare(emp1.getSalary(), emp2.getSalary());
        if (salaryComparison == 0) {
            return emp1.getName().compareTo(emp2.getName());
        } return salaryComparison;
    }
}
public class comparators {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Kiran", 90000));
        employees.add(new Employee("Somu", 60000));
        employees.add(new Employee("Ram", 58560));
        employees.add(new Employee("Charan", 55900));
        Collections.sort(employees, new EmployeeComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

