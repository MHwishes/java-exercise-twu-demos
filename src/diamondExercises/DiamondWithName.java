package diamondExercises;

import java.util.Scanner;

public class DiamondWithName {
    private static void  getDiamond(int n,int i,String name){
        int  j, k;
        for (k = 0; k < n - i; k++) {
            System.out.print(" ");
        }

        if(n-1==i){
            System.out.print(name);
        } else {
            for (j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入值：");
        int n = sc.nextInt();
        System.out.println("请输入名字：");
        String  name=sc.next();
        int i;
        for (i = 0; i < n; i++)  getDiamond(n,i,name);

        for (i = n-2; i >= 0; i--) getDiamond(n,i,name);
    }
}
