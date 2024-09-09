import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the user name: ");
        String username = input.next();

        System.out.println("Input the password: ");
        String password = input.next();

        try {
            login(username, password);
            System.out.println("Login successed!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }

    public static void login(String username, String password) {
        if (!("sally".equals(username))) {
            throw new LoginException("User name is not exsits");
        }
        if (!("123".equals(password))) {
            throw new LoginException("Password is not right");
        }
    }
}
