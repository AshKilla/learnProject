package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-03-06-16:39
 */
public class Insertion_sort {
    public static void main(String[] args) {
        int[] arrays = {1,4,7,3,2,6,89,3,6,9};
        int[] sort_arrays = insertionSort(arrays);
        for (int i : sort_arrays){
            System.out.println(i);
        }
    }
    public static int[] insertionSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }
}
