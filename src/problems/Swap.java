package problems;

import java.util.Arrays;

public class Swap {


    public static void swap(int[] arr, int index1, int index2) {

        if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            System.out.println("Invalid indices provided.");
            return;
        }

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Before swap: " + Arrays.toString(numbers));
        swap(numbers, 1, 3);

        System.out.println("After swap:  " + Arrays.toString(numbers));
    }
}