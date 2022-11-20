package prac5;

import java.util.Scanner;

public class n15 {
    public static void from_r_to_l(int n) {
        if (n > 0) {
            System.out.print(n % 10 + " ");
            from_r_to_l(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        from_r_to_l(n);
    }
}