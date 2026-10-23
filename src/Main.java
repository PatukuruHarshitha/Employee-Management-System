
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid ID! Enter a whole number.");
                        scanner.nextLine();
                        break;
                    }

                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();

                    System.out.print("Enter Salary: ");

                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid salary! Enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    double salary = scanner.nextDouble();
                    scanner.nextLine();

                    Employee employee =
                            new Employee(id, name, department, salary);

                    service.addEmployee(employee);
                    break;

                case 2:
                    service.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid ID! Enter a whole number.");
                        scanner.nextLine();
                        break;
                    }

                    int searchId = scanner.nextInt();
                    scanner.nextLine();

                    service.searchEmployee(searchId);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to update: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid ID! Enter a whole number.");
                        scanner.nextLine();
                        break;
                    }

                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    service.updateEmployee(updateId, scanner);
                    break;

                case 5:
                    System.out.print("Enter Employee ID to delete: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid ID! Enter a whole number.");
                        scanner.nextLine();
                        break;
                    }

                    int deleteId = scanner.nextInt();
                    scanner.nextLine();

                    service.deleteEmployee(deleteId);
                    break;

                case 6:
                    System.out.println("Thank you for using the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose 1 to 6.");
            }
        }
    }
}

