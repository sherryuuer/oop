package datatype.src;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2001;

        boolean res = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(res);
    }
}
