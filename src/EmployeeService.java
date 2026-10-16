
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\n===== Employee Details =====");

        for (Employee employee : employees) {
            System.out.println("----------------------------");
            System.out.println("ID         : " + employee.getId());
            System.out.println("Name       : " + employee.getName());
            System.out.println("Department : " + employee.getDepartment());
            System.out.println("Salary     : " + employee.getSalary());
        }

        System.out.println("----------------------------");
    }

    public void searchEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Employee Found!");
                System.out.println(employee);
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    public void updateEmployee(int id, Scanner scanner) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {

                System.out.print("Enter new name: ");
                String name = scanner.nextLine();

                System.out.print("Enter new department: ");
                String department = scanner.nextLine();

                System.out.print("Enter new salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();

                Employee updatedEmployee =
                        new Employee(id, name, department, salary);

                int index = employees.indexOf(employee);
                employees.set(index, updatedEmployee);

                System.out.println("Employee updated successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}
