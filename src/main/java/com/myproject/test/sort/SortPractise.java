package com.myproject.test.sort;

import java.util.Arrays;

public class SortPractise {

    public static void main(String[] args) {
        //冒泡排序
        int[] nums = new int[]{3, 38, 28, 39, 93, 54, 43, 32, 33, 20, 1, 78, 2, 28, 'm', 56};
        int length = nums.length;
        System.out.println("冒泡排序---------------");
        System.out.println("排序前：" + Arrays.toString(nums));
        for (int i = 0; i <length-1 ; i++) {
            for (int j = i+1; j <length ; j++) {
                if(nums[j]<nums[i]){
                    nums[j] = nums[i] + nums[j];
                    nums[i] = nums[j] - nums[i];
                    nums[j] = nums[j] - nums[i];
                }
            }
        }
        System.out.println("排序后："+Arrays.toString(nums));

        //选择排序
        System.out.println("选择排序---------------");
        nums = new int[]{3, 38, 28, 39, 93, 54, 43, 32, 33, 20, 1, 78, 2, 28, 'm', 56};
        System.out.println("排序前："+Arrays.toString(nums));
        for (int i = 0; i <length-1 ; i++) {
            int index = i;
            for (int j = i+1; j <length ; j++) {
                if(nums[j]<nums[index]){
                    index = j;
                }
            }
            nums[i] = nums[index]+nums[i];
            nums[index] = nums[i]-nums[index];
            nums[i] = nums[i] - nums[index];
        }
        System.out.println("排序后："+Arrays.toString(nums));

        //插入排序
        System.out.println("插入排序---------------");
        nums = new int[]{3, 38, 28, 39, 93, 54, 43, 32, 33, 20, 1, 78, 2, 28, 'm', 56};
        System.out.println("排序前："+Arrays.toString(nums));
        for (int i = 1; i <length ; i++) {
            int insertIndex = i-1;
            int insertValue = nums[i];
            while(insertIndex>=0&&insertValue<nums[insertIndex]){
                nums[insertIndex+1] = nums[insertIndex];
                insertIndex--;
            }
            nums[insertIndex+1] = insertValue;
        }
        System.out.println("排序后："+Arrays.toString(nums));
        System.out.println("快速排序---------------");
        nums = new int[]{3, 38, 28, 39, 93, 54, 43, 32, 33, 20, 1, 78, 2, 28, 'm', 56};
        System.out.println("排序前："+Arrays.toString(nums));
        quickSort(nums,0,nums.length-1);
        System.out.println("排序后："+Arrays.toString(nums));
    }

    public static void quickSort(int[] nums,int left,int right){
        int r = right;
        int l = left;
        int pivot = nums[(left+right)/2];
        while(l<r){
            while(nums[l]<pivot){
                l++;
            }
            while(nums[r]>pivot){
                r--;
            }
            if(l>=r){
                break;
            }
            nums[l] = nums[l] + nums[r];
            nums[r] = nums[l] - nums[r];
            nums[l] = nums[l] - nums[r];
            if(nums[l]==pivot){
                r--;
            }
            if(nums[r]==pivot){
                l++;
            }
        }
        if(l==r){
            r--;
            l++;
        }
        if(l<right){
            quickSort(nums,l,right);
        }
        if(r>left){
            quickSort(nums,left,r);
        }
    }
}
