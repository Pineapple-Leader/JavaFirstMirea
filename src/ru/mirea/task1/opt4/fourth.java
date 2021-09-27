package ru.mirea.task1.opt4;
import java.util.Arrays;

public class fourth {

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 100));
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Sorted array: ");
        boolean isSorted = false;
        int z;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;
                    z = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = z;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}