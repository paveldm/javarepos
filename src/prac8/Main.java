package prac8;

public class Main {

    public static void main(String[] args) {
        BoundedWaitList arr1 = new BoundedWaitList<>(5);
        for(int i = 0; i < 5; i++){
            arr1.add(i);
        }
        System.out.println(arr1);

        int elem = 3;
        if(arr1.contains(elem)){
            System.out.println("Список содержит элемент " + elem);
        }
        else {
            System.out.println("Элемент отсутствует");
        }
        UnfairWaitList arr2 = new UnfairWaitList<>();
        for(int i = 0; i < 5; i++){
            arr2.add(i);
        }
        System.out.println(arr2);
        arr2.remove(1);
        arr2.moveToBack(4);
        System.out.println(arr2);
    }
}