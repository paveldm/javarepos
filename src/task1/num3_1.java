package task1;

public class num3_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
