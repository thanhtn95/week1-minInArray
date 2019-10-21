import java.util.ArrayList;
import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size :");
        int size = sc.nextInt();
        int[] numbers = getArray(size);
        System.out.println("Number Array: ");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else System.out.print(numbers[i]);
        }
        System.out.println();
        int min = getMin(numbers);
        ArrayList<Integer> index = getMinIndex(numbers, min);
        System.out.println("Min of Array is " + min + " at position : ");
        for (int i : index) {
            System.out.print(i + ", ");
        }
    }

    private static int[] getArray(int size) {
        int[] tmp = new int[size];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = (int) Math.floor(Math.random() * 100);
        }
        return tmp;
    }

    private static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    private static ArrayList<Integer> getMinIndex(int[] arr, int min) {
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) index.add(i);
        }
        return index;
    }
}

