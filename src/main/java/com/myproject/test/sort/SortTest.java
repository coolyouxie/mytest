package com.myproject.test.sort;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) {
        //冒泡排序
        int[] nums = new int[]{3, 38, 28, 39, 93, 54, 43, 32, 33, 20, 1, 78, 2, 28, 'm', 56};
        System.out.println("冒泡排序---------------");
        System.out.println("排序前：" + Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            int num1 = nums[i];
            boolean flag = true;
            for (int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                if (num1 > num2) {
                    num1 = num1 + num2;
                    num2 = num1 - num2;
                    num1 = num1 - num2;
                    nums[i] = num1;
                    nums[j] = num2;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        //选择排序
        System.out.println("排序后：" + Arrays.toString(nums));
        System.out.println("选择排序---------------------");
        nums = new int[]{3, 38, 28, 39, 93, 54, 43, 32, 33, 20, 1, 78, 2, 28, 'm', 56};
        System.out.println("排序前：" + Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                //遍历找到最小值
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            int tmp = nums[index];
            nums[index] = nums[i];
            nums[i] = tmp;
        }
        //插入排序
        System.out.println("排序后：" + Arrays.toString(nums));
        System.out.println("插入排序--------------");
        nums = new int[]{3, 38, 28, 39, 93, 54, 43, 32, 33, 20, 1, 78, 2, 28, 'm', 56};
        System.out.println("排序前：" + Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            int insertValue = nums[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertValue < nums[insertIndex]) {
                nums[insertIndex + 1] = nums[insertIndex];
                insertIndex--;
            }
            nums[insertIndex + 1] = insertValue;
        }
        System.out.println("排序后：" + Arrays.toString(nums));
        //快速排序
        System.out.println("快速排序----------");
        nums = new int[]{3, 38, 28, 39, 93, 54, 43, 38, 33, 32, 33, 20, 1, 78, 28, 2, 'm', 56};
        System.out.println("排序前：" + Arrays.toString(nums));
        quickSort(nums, 0, nums.length - 1);
        System.out.println("排序后："+Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int left, int right) {
        int pivot = nums[(left + right) / 2];
        int l = left;
        int r = right;
        while (l < r) {
            while (nums[l] < pivot) {
                l += 1;
            }
            while (nums[r] > pivot) {
                r -= 1;
            }
            if (l >= r) {
                break;
            }
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            if (nums[l] == pivot) {
                r -= 1;
            }
            if (nums[r] == pivot) {
                l += 1;
            }
        }
        if (l == r) {
            l += 1;
            r -= 1;
        }
        if (left < r) {
            quickSort(nums, left, r);
        }
        if (l < right) {
            quickSort(nums, l, right);
        }
    }
}
