package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
public class ArrangeNegAtFront {

    //O(n) time // O(n) space
    public static  void arrange(int arr[]){
        int tempArray[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                tempArray[j++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                tempArray[j++]=arr[i];
            }
        }
        System.arraycopy(tempArray,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int arr[] = {12,11,-13,-5,6,-7,5,-3,-6};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
        int arr1[] = {-12,11,0,-5,6,-7,5,-3,-6};
        arrange(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
