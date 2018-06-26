package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */

//Double the first element and move zero to end
public class DoubleFirstElementMoveZeroAtEnd {

    //O(n)
    public  static  void rearrange(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i]*=2;
                arr[i+1]=0;
            }
        }
        moveZeroAtEnd4(arr);
    }

    public  static void moveZeroAtEnd4(int arr[]){
        int nonZeroCount=0,temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp = arr[nonZeroCount];
                arr[nonZeroCount]=arr[i];
                arr[i]=temp;
                nonZeroCount++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 0, 4, 0, 8};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
        int arr2[]={0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        rearrange(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}

