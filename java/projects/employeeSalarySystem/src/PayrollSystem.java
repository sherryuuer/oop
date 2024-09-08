import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee("Jack", new MyData(1990, 1, 23), 12000);
        employees[1] = new SalariedEmployee("Sally", new MyData(1990, 1, 27), 19000);
        employees[2] = new HourlyEmployee("Jacy", new MyData(1990, 3, 23), 500, 10);

        Scanner input = new Scanner(System.in);
        System.out.println("Input the month: ");
        int mon = input.nextInt();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof SalariedEmployee && employees[i].getBirthday().getMonth() == mon) {
                // 注意这两行的定义方法
                SalariedEmployee se = (SalariedEmployee) employees[i];
                se.setMonthlySalary(se.getMonthlySalary() + 100);
            }
            System.out.println(employees[i].toString());
        }
        input.close();
    }

}
