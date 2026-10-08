import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Add Employee selected.");
                    break;

                case 2:
                    service.viewEmployees();
                    break;

                case 3:
                    System.out.println("Thank you for using the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
