package Module1_2;


import java.util.Arrays;

public class ArrayUserProcess {
    public void ArraySort(int[] massive) {
        Arrays.sort(massive);
        System.out.println(Arrays.toString(massive));
    }

    public static void ArrayFindNum(int[] massive, int num) {
        for (int i = 0; i < massive.length; i++) {
            if (num == massive[i]) {
                System.out.println("Number " + num + " at index " + i);
                break;
            }
            System.out.println("Number not found");
            break;
        }
    }
}
