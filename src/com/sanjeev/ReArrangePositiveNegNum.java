package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
public class ReArrangePositiveNegNum {

    //O(n2) Time Complexity
    //O(1) Space
    //Order Maintain
    public static void rearrange1(int arr[]){
        boolean positive=false;
        int temp,j;
        for(int i=0;i<arr.length;i++) {
            positive = !positive;
            if ((positive && arr[i] >= 0) || (!positive && arr[i] < 0)) {
                continue;
            }
            temp = arr[i];
            for(j=i+1;j<arr.length;j++){
                if((positive && arr[j]>=0)||(!positive && arr[j]<0)){
                    break;
                }
            }
            if(j<arr.length){
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void rearrange2(int arr[]){

    }

    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        rearrange1(arr);
        System.out.println(Arrays.toString(arr));
        int arr1[] = {-1, -2, -3, 4, 5, -6, -7, 8, 9};
        rearrange1(arr1);
        System.out.println(Arrays.toString(arr1));
        int arr2[] = {-1, -2, -3, -4, -5, -6, -7, -8, -9};
        rearrange1(arr2);
        System.out.println(Arrays.toString(arr2));
        int arr3[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rearrange1(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
