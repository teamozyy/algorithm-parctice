package com.algorithm.selectionsort;

import java.util.Random;

/**
 * Created by hbxie on 2021/10/28.
 */
public class ArrayGenerator {
    private ArrayGenerator() {

    }

    public static Integer[] generateOrderedArray(int n) {
        Integer [] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        return arr;
    }

    // 生成一个长度为 n 的随机数组，每个数字的范围是 [0, bound)
    public static Integer[] generateRandomArray(int n, int bound) {
        Integer [] arr = new Integer[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i ++) {
            arr[i] = rnd.nextInt(bound);
        }

        return arr;
    }
}
