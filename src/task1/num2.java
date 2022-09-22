package task1;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i; j++){
                sum += (1.0 / j);
            }
            System.out.println(i + " " + sum);
            sum = 0;
        }
    }
}
