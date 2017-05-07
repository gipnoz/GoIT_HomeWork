package HomeWork.Module1;

import java.util.Scanner;

public class Hello_User {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String s1;
        s1 = sc.nextLine();
        System.out.println("Hello, " + s1);

    }
}
