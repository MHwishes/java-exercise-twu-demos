package diamondExercises;

import java.util.Scanner;

public class Diamond {
    private static void  getDiamond(int n,int i){
        int  j, k;
        for (k = 0; k < n - i; k++) {
            System.out.print(" ");
        }

        for (j = 1; j <= 2 * i + 1; j++) {
            System.out.print("*");
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入值：");
        int n = sc.nextInt();
        int i;
        for (i = 0; i < n; i++)  getDiamond(n,i);

        for (i = n-2; i >= 0; i--) getDiamond(n,i);
    }

}

