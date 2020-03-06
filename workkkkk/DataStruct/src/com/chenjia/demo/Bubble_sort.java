package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-03-06-16:18
 */
public class Bubble_sort {
    public static void main(String[] args) {
        int[] arrays = {1,4,7,3,2,6,89,3,6,9};
        int[] sort_array = bubbleSort(arrays);
        for (int i : sort_array){
            System.out.println(i);
        }
        System.out.println(sort_array.toString());
    }
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }
}
