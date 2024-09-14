package abstractfactory;

public class SqlServerFactory implements Factory {
    @Override
    public User createUser() {
        return new SqlServerUser();
    }

    @Override
    public Department createDepartment() {
        return new SqlserverDepartment();
    }
}
