package prac5;

import java.util.Scanner;

public class n16 {
    public static void max_elem(int max, int count){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {
            if (n > max) {
                max_elem(n, 1);
            }
            else if (n == max) {
                max_elem(max, count+1);
            }
            else {
                max_elem(max, count);
            }
        }
        else {
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        max_elem(0,0);
    }
}
