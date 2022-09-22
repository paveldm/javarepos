package task1;
import java.util.Random;

public class num3_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = rnd.nextInt(100);
        }
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
