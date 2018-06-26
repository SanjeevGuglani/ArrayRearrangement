package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
//Reorder an array according to given indexes

    /*Input:  arr[]   = [10, 11, 12];
            index[] = [1, 0, 2];
            Output: arr[]   = [11, 10, 12]
            index[] = [0,  1,  2]*/


public class ReArrangeAccordingToGivenIndex {

    //O(n) //O(n)
    public static int[] rearrange(int arr[],int index[]){
        int res_Array[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res_Array[index[i]]=arr[i];
        }
        return res_Array;
    }

    

    public static void main(String[] args) {
        int arr[]= {10,11,12};
        int index[]={1,0,2};
        arr=rearrange(arr,index);
        System.out.println(Arrays.toString(arr));
        int arr2[]= {50, 40, 70, 60, 90};
        int index2[]={3,  0,  4,  1,  2};
        arr2=rearrange(arr2,index2);
        System.out.println(Arrays.toString(arr2));
    }
}

