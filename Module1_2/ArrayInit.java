package Module1_2;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayInit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        ArrayHolder massive = new ArrayHolder(scanner.nextInt());
        System.out.println("Enter arrays elements: ");
        for (int i = 0; i < massive.getMassive().length; i++) {
            massive.getMassive()[i] = scanner.nextInt();}
            System.out.println(Arrays.toString(massive.getMassive()));

        while (true) {
            System.out.println("Welcome to main menu!" +
                    "\nChoose the option you need by typing 1 or 2:" +
                    "\n1.Find int in array" +
                    "\n2.Sort array");
            int selection = scanner.nextInt();
            ArrayUserProcess arrayUserProcess = new ArrayUserProcess();
            if (selection == 1) {
                System.out.println("Enter number");
                ArrayUserProcess.ArrayFindNum(massive.getMassive(), scanner.nextInt());
                {
                    break;

                }
            } else if (selection == 2) {
                arrayUserProcess.ArraySort(massive.getMassive());
                {
                    break;
                }

            } else {
                System.out.println("ERROR!!!Type 1 or 2!" +
                        "\nOnce again" +
                        "\n__________________________________________________");

            }

        }
    }
}


