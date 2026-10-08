public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        Employee employee1 = new Employee(
                101,
                "Harshitha",
                "IT",
                30000
        );

        service.addEmployee(employee1);

        service.viewEmployees();
    }
}
