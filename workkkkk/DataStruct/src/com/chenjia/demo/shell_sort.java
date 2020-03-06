package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-03-06-16:56
 */
public class shell_sort {
    public static int[] ShellSort(int[] array) {
        int len = array.length;
        //希尔增量取len/2
        int temp, gap = len / 2;

        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }
}
