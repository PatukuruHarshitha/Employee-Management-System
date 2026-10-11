switch (choice) {

    case 1:
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(
                id, name, department, salary
        );

        service.addEmployee(employee);
        break;

    case 2:
        service.viewEmployees();
        break;

    case 3:
        System.out.print("Enter Employee ID to search: ");
        int searchId = scanner.nextInt();
        service.searchEmployee(searchId);
        break;

    case 4:
        System.out.println("Thank you for using the system.");
        scanner.close();
        return;

    default:
        System.out.println("Invalid choice. Please try again.");
}
