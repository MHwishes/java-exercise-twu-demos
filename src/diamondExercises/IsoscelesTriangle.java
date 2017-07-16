package diamondExercises;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入值：");
        int n = sc.nextInt();
        int i, j, k;
        for (i = 0; i < n; i++) {

            for (k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            for (j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }
}
