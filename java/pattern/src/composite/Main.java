package composite;

public class Main {
    public static void main(String[] args) {
        ConcreteCompany headmaster = new ConcreteCompany("东京总部");
        headmaster.add(new HRDepartment("总部人力资源办公室"));
        headmaster.add(new FinanceDepartment("总部洗钱财务办公室"));

        ConcreteCompany branch1 = new ConcreteCompany("仙台分部");
        branch1.add(new HRDepartment("仙台人力资源办公室"));
        branch1.add(new FinanceDepartment("仙台洗钱财务办公室"));
        headmaster.add(branch1);

        ConcreteCompany branch2 = new ConcreteCompany("大阪分部");
        branch2.add(new HRDepartment("大阪人力资源办公室"));
        branch2.add(new FinanceDepartment("大阪洗钱财务办公室"));
        headmaster.add(branch2);

        ConcreteCompany branch3 = new ConcreteCompany("福冈分部");
        branch3.add(new HRDepartment("福冈人力资源办公室"));
        branch3.add(new FinanceDepartment("福冈洗钱财务办公室"));
        headmaster.add(branch3);

        System.out.println("\n组织结构图: ");
        headmaster.display(2);

        System.out.println("\n组织职责图: ");
        headmaster.lineOfDuty();
    }
}
