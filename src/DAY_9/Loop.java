package DAY_9;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number greater than 2: ");
        int n = sc.nextInt();
        switch (n) {
            case 2:
            case 3:
            case 4:
            case 5:
                for(int i = 1;i<=10;i++){
                    System.out.println(n+" * "+i+" = "+n*i);
                }
                break;

            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}
