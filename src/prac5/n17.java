package prac5;

import java.util.Scanner;

public class n17 {
    public static int max_num() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n != 0) {
            return Math.max(n, max_num());
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(max_num());
    }
}