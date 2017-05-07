package HomeWork.Module1;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int ar[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            ar[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.print(Arrays.toString(ar));

    }
}
