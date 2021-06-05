package fIbonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci n:");
        n = input.nextInt();
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        if (n == 1) {
            System.out.println(n - 1 + " " + n);
        }
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        System.out.println(Arrays.toString(fibonacci));

    }
}
