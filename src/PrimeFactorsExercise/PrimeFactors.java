package PrimeFactorsExercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
    private static List<Integer> generate(int n) {
        List<Integer> primeList = new ArrayList<Integer>();
        int i;
        for (i = 2; i <= n; i++) {
            if (i == n) {
                primeList.add(i);
            } else if (n % i == 0) {
                primeList.add(i);
                n = n / i;
            }
        }
        return primeList;
    }

    public static void main(String[] args) {
        System.out.print("please input the n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("[]");
        } else if (n > 1) {
            List<Integer> primeList = generate(n);
            for (int element : primeList) {
                System.out.println(element);
            }
        }

    }
}
