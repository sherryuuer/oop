package controlflow.src;

import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type a int number: ");
        // 如果没有这句，用户并不知道一开始就要输入东西
        int num = input.nextInt();

        System.out.println("Num: " + num);
        input.close();
    }
}
