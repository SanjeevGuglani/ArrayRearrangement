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

    //O(n2) place  maintain
    public  static void moveZeroAtEnd2(int arr[]){
        int nonZeroIndex=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                rotateArrayByOne(arr,i,nonZeroIndex);
                nonZeroIndex--;
            }
        }

    }

    //O(n) place maintain no extra rotate but two loop
    public  static void moveZeroAtEnd3(int arr[]){
        int nonZeroCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[nonZeroCount]=arr[i];
                nonZeroCount++;
            }
        }
        for(int i=nonZeroCount;i<arr.length;i++){
            arr[i]=0;
        }

    }


    //O(n) place maintain no extra rotate only one loop
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
        System.out.println("**********Method 3*********");
        int arr3[] = {1, 0, 3, 0, 0, 6, -3, 1, 0,0};
        moveZeroAtEnd3(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("**********Method 4*********");
        int arr4[] = {1, 0, 3, 0, 0, 6, -3, 1, 0,0};
        moveZeroAtEnd4(arr4);
        System.out.println(Arrays.toString(arr4));

    }
}
