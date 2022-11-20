package prac6;

public class App {

    public static void insertionSort(Comparable[] arr) {
        Comparable curr;
        for (int i = 1; i < arr.length; i++) {
            curr = arr[i];
            for (int j = i; j > 0; j--) {
                if (arr[j - 1].compareTo(curr) == 1) {
                    arr[j] = arr[j - 1];
                }
                else {
                    arr[j] = curr;
                    break;
                }
            }
        }
    }

    private static int separation(Student[] arr, int left, int right) {
        Student separator = arr[right];
        int i = (left - 1);

        Student temp;
        for (int j = left; j <= right - 1; j++) {
            if (arr[j].getSortingByGPA().compare(arr[j], separator) != 1) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return (i + 1);
    }

    public static void quickSort(Student[] arr, int left, int right) {
        if (left < right) {
            int separator = separation(arr, left, right);
            quickSort(arr, left, separator - 1);
            quickSort(arr, separator + 1, right);
        }
    }

    public static Student[] mergeSort(Student[] leftArr, Student[] rightArr) {
        int left = leftArr.length, right = rightArr.length;
        Student[] newArr = new Student[left + right];
        System.arraycopy(leftArr, 0, newArr, 0, left);
        System.arraycopy(rightArr, 0, newArr, left, right);
        mergeSort(newArr, 0, left + right - 1);
        return newArr;
    }

    public static void mergeSort(Student[] arr, int l, int r) {
        if (l == r) return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        int i = l;
        int j = mid + 1;
        Student[] tmp = new Student[arr.length];
        for (int step = 0; step < r - l + 1; step++) {
            if ((j > r) || ((i <= mid) && (arr[i].getSortingByGPA().compare(arr[i], arr[j]) == -1))) {
                tmp[step] = arr[i];
                i++;
            } else {
                tmp[step] = arr[j];
                j++;
            }
        }
        for (int step = 0; step < r - l + 1; step++)
            arr[l + step] = tmp[step];
    }

    public static void main(String[] args) {
        Student[] iDNumber = new Student[5];
        iDNumber[0] = new Student("Mike", 1, 54);
        iDNumber[1] = new Student("John", 2, 66);
        iDNumber[2] = new Student("Masha", 4, 49);
        iDNumber[3] = new Student("Ann", 5, 75);
        iDNumber[4] = new Student("Michael", 3, 32);

        //insertionSort(iDNumber);
        //quickSort(iDNumber, 0, iDNumber.length - 1);

/*        for (Student student : iDNumber) {
            System.out.println(student);
        }*/
        Student[] iDNumber2 = new Student[5];
        iDNumber2[0] = new Student("Alexander", 6, 99);
        iDNumber2[1] = new Student("Jacob", 9, 80);
        iDNumber2[2] = new Student("Amanda", 8, 31);
        iDNumber2[3] = new Student("Emma", 7, 70);
        iDNumber2[4] = new Student("Victoria", 10, 45);

        Student[] newArr = mergeSort(iDNumber, iDNumber2);
        for (Student student : newArr) {
            System.out.println(student);
        }
    }
}