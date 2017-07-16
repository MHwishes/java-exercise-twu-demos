package triangleExercises;

import java.util.Scanner;

public class DrawARightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入值：");
        int n = sc.nextInt();
        int i ,j;
        for (i = 0; i < n; i++) {
           for(j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.print('\n');
        }
    }
}

