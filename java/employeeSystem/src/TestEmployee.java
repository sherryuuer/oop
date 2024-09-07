import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeService es = new EmployeeService();

        while (true) {
            System.out.println("Input employee info:");
            System.out.println("Input employee id: ");
            int id = input.nextInt();

            System.out.println("Input employee name: ");
            String name = input.next();

            System.out.println("Input employee salary: ");
            double salary = input.nextDouble();

            System.out.println("Input employee tel: ");
            String tel = input.next();

            Employee employee = new Employee(id, name, salary, tel);
            es.addEmployee(employee);

            System.out.println("Do you want to finish the input?(y/n): ");
            char confirm = input.next().charAt(0);

            if (confirm == 'Y' || confirm == 'y') {
                input.close();
                break;
            }
        }

        // sort by salary
        Employee[] employees = es.getAll();
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getSalary() > employees[j + 1].getSalary()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        // get all the info
        for (int i = 0; i < employees.length; i++) {
            employees[i].detail();
        }
    }
}
