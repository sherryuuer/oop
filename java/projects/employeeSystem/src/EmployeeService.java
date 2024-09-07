public class EmployeeService {
    private Employee[] all;
    private int total; // 没有初始化total的数字，默认为0

    public EmployeeService() {
        all = new Employee[2];
    }

    public void addEmployee(Employee employee) {
        // 如果total超过了数组all的长度，则扩大all容量为1.5倍
        if (total >= all.length) {
            Employee[] newArr = new Employee[all.length + (all.length >> 2)];
            for (int i = 0; i < all.length; i++) {
                newArr[i] = all[i];
            }
            all = newArr;
        }

        all[total++] = employee;
    }

    public Employee[] getAll() {
        Employee[] result = new Employee[total];

        for (int i = 0; i < total; i++) {
            result[i] = all[i];
        }

        return result;
    }
}
