public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("12345", "Peter", 12000);
        System.out.println(account.detail());

        try {
            account.save(20000);
            System.out.println("Money saved");
        } catch (Exception e) {
            System.out.println("Failed for: " + e.getMessage());
        } finally {
            System.out.println(account.detail());
        }

        try {
            account.save(-20000);
            System.out.println("Money saved");
        } catch (Exception e) {
            System.out.println("Failed for: " + e.getMessage());
        } finally {
            System.out.println(account.detail());
        }

        try {
            account.withdraw(50000);
            System.out.println("Withdraw successed");
        } catch (Exception e) {
            System.out.println("Failed for: " + e.getMessage());
        } finally {
            System.out.println(account.detail());
        }

        try {
            account.save(10000);
            System.out.println("Withdraw successed");
        } catch (Exception e) {
            System.out.println("Failed for: " + e.getMessage());
        } finally {
            System.out.println(account.detail());
        }
    }
}
