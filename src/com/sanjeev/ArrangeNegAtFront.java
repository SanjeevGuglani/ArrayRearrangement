package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
public class ArrangeNegAtFront {

    //O(n) time // O(n) space // order maintain
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

    //O(n) //O(1) order not maintain
    public static  void arrange1(int arr[]){
        int i=0,j=arr.length-1,temp;
        while (true){
            while(i<arr.length){
                if(arr[i]>=0) break;
                i++;
            }
            while(j>=0){
                if(arr[j]<0) break;
                j--;
            }
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }else {
                break;
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("******method 1*******");
        int arr[] = {12,11,-13,-5,6,-7,5,-3,-6};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
        int arr1[] = {-12,11,0,-5,6,-7,5,-3,-6};
        arrange(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("******method 2*******");
        int arr2[] = {12,11,-13,-5,6,-7,5,-3,-6};
        arrange1(arr2);
        System.out.println(Arrays.toString(arr2));
        int arr3[] = {-12,11,0,-5,6,-7,5,-3,-6};
        arrange1(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
