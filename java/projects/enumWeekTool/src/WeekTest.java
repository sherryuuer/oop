import java.util.Scanner;

public class WeekTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the week value: ");
        int value = input.nextInt();

        Week week = Week.getByValue(value);
        if (week != null) {
            System.out.println("Week name: " + week.name());
            System.out.println("Week ordinal: " + week.ordinal());
        }

        switch (week) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Some thing goes wrong");
        }

        input.close();
    }
}
