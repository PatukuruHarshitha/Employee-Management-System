import java.util.ArrayList;
import java.util.List;

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
}
