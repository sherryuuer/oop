public class TestSystem {
    public static void main(String[] args) {
        Student student = new Student("Sally", "84795778943", "8947945", 99.9);
        String student_info = student.detail();
        System.out.println(student_info);

        Employee employee = new Employee("Jack", "0908893990", "7839475", 93487.0);
        String employee_info = employee.detail();
        System.out.println(employee_info);
    }
}
