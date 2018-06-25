package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
public class ZerosAtEnd {

    //O(n) place not maintain
    public  static void moveZeroAtEnd(int arr[]){
        int nonZeroIndex=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                arr[i]=arr[nonZeroIndex];
                arr[nonZeroIndex]=0;
                nonZeroIndex--;
            }
        }
    }

    //O(n) place not maintain
    public  static void moveZeroAtEnd2(int arr[]){
        int nonZeroIndex=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                rotateArrayByOne(arr,i,nonZeroIndex);
                nonZeroIndex--;
            }
        }

    }


    public static void rotateArrayByOne(int arr[],int beg,int end){
        int temp = arr[beg];
        for(int i=beg+1;i<=end;i++){
            arr[i-1]=arr[i];
        }
        arr[end]=temp;
    }

    public static void main(String[] args) {
        System.out.println("**********Method 1*********");
        int arr[] = {1, 0, 3, 0, 0, 6, -3, 1, 0,0};
        moveZeroAtEnd(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("**********Method 2*********");
        int arr2[] = {1, 0, 3, 0, 0, 6, -3, 1, 0,0};
        moveZeroAtEnd2(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
