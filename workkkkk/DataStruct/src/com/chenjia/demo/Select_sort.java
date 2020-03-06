package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-03-06-16:27
 */
public class Select_sort {
    public static void main(String[] args) {
        int[] arrays = {1,4,7,3,2,6,89,3,6,9};
        int[] sort_arrays = selectionSort(arrays);
        for (int i : sort_arrays){
            System.out.println(i);
        }
    }

    public static int[] selectionSort(int[] array) {
        if (array.length == 0){
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array [min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }
        return array;
    }
}
