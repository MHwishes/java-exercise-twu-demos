import java.util.Scanner;

public class DrawAVerticalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            i++;
            System.out.println("*");
        }

    }

}
