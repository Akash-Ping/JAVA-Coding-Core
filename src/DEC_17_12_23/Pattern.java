package DEC_17_12_23;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        // Code to print pattern 1
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Code to print pattern 2
        for (int i = 0; i < t; i++) {
            for (int j = t; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Code to print pattern 3
        for (int i = 0; i < t; i++) {
            for (int j = t; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Code to print pattern 4
        for (int i = 1; i <= t; i++) {

            for (int j=1 ;j<=i ;j++ )
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
}
