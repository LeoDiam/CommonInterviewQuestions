package com.leo.arrays;

public class findDuplicateNumber {
    public static void main(String[] args) {

        int[] a = {1, 7, 5, 3, 123};
        int[] b = {2, 8, 6, 4, 12,73,54,34};
        System.out.println(findDupl(a, b));

    }

    public static Boolean findDupl(int[] a, int[] b) {
        for (int k : a) {
            for (int i : b) {
                if (k == i) {
                    return true;
                }
            }
        }
        return false;
    }
}

