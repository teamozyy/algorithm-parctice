package com.algorithm.quicksort;

import com.algorithm.mergesort.ArrayGenerator;
import com.algorithm.mergesort.SortingHelper;

import java.util.Arrays;

public class QuickSort {
    private QuickSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int partitionIndex = partition(arr, l, r);

        sort(arr, l, partitionIndex - 1);
        sort(arr, partitionIndex + 1, r);
    }

    private static <E extends Comparable<E>> int partition(E[] arr, int l, int r){
        // arr[l+1...j] < v ; arr[j+1...i] >= v
        int j = l;
        for(int i = l + 1; i <= r; i ++) {
            if(arr[i].compareTo(arr[l]) < 0) {
                j ++;
                swap(arr, i, j);
            }
        }

        swap(arr, l, j);

        return j;
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args){
        int n = 1000000;

        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);

        SortingHelper.sortTest("MergeSort", arr);
        SortingHelper.sortTest("QuickSort", arr2);
    }
}
