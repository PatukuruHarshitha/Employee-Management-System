
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    // Add Employee with Input Validation
    public void addEmployee(Employee employee) {

        if (employee.getId() <= 0) {
            System.out.println("Error: Employee ID must be positive.");
            return;
        }

        for (Employee existingEmployee : employees) {
            if (existingEmployee.getId() == employee.getId()) {
                System.out.println("Error: Employee ID already exists.");
                return;
            }
        }

        if (employee.getName() == null ||
                employee.getName().trim().isEmpty()) {
            System.out.println("Error: Employee name cannot be empty.");
            return;
        }

        if (employee.getDepartment() == null ||
                employee.getDepartment().trim().isEmpty()) {
            System.out.println("Error: Department cannot be empty.");
            return;
        }

        if (employee.getSalary() <= 0 ||
                Double.isNaN(employee.getSalary()) ||
                Double.isInfinite(employee.getSalary())) {
            System.out.println("Error: Salary must be a valid positive number.");
            return;
        }

        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    // View All Employees
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

    // Search Employee by ID
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

    // Update Employee Details
    public void updateEmployee(int id, Scanner scanner) {

        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);

            if (employee.getId() == id) {

                System.out.print("Enter new name: ");
                String name = scanner.nextLine();

                if (name.trim().isEmpty()) {
                    System.out.println("Error: Name cannot be empty.");
                    return;
                }

                System.out.print("Enter new department: ");
                String department = scanner.nextLine();

                if (department.trim().isEmpty()) {
                    System.out.println("Error: Department cannot be empty.");
                    return;
                }

                System.out.print("Enter new salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();

                if (salary <= 0 ||
                        Double.isNaN(salary) ||
                        Double.isInfinite(salary)) {
                    System.out.println("Error: Salary must be positive.");
                    return;
                }

                Employee updatedEmployee =
                        new Employee(id, name, department, salary);

                employees.set(i, updatedEmployee);

                System.out.println("Employee updated successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    // Delete Employee by ID
    public void deleteEmployee(int id) {

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                System.out.println("Employee deleted successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}
