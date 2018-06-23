package com.sanjeev;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sanjeev Guglani
 */
public class ReArrangeIndexElementToArray {
    //Rearrange an array such that arr[i] = i
    //O(n2) time
    //O(n) space
    public static void method1(int arr[]){
        int resultantArray[]=new int[arr.length];
        int j;
        for(int i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                if(arr[j]==i){
                    resultantArray[i]=i;
                    break;
                }
            }
            if(j==arr.length){
                resultantArray[i]=-1;
            }
        }
        System.arraycopy(resultantArray,0,arr,0,resultantArray.length);
    }

    // Time nlogn
    //space n
    public static void method2(int arr[]){
        Arrays.sort(arr);   //nlogn
        int resultantArray[]= new int[arr.length];
        for(int i=arr.length-1,j=arr.length-1;i>=0;i--){
            if(arr[j]==i){
                resultantArray[i]=i;
                j--;
            }else {
                resultantArray[i]=-1;
            }
        }
        System.arraycopy(resultantArray,0,arr,0,resultantArray.length);
    }


    //Time nlogn
    //space O(1)
    public static void method3(int arr[]){
        Arrays.sort(arr);   //nlogn
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                if(arr[i]!=i) {
                    arr[arr[i]] = arr[i];
                    arr[i] = -1;
                }
            }
        }
    }


    //Time O(n)
    //space O(n)
    public static void method4(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(set.contains(i)){
                arr[i]=i;
            }else {
                arr[i]=-1;
            }
        }
    }

    //O(n) need to check
    public static void method5(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1 && arr[i]!=i){
                int j=arr[i];
                arr[i]=-1;
                while(arr[j]!=-1){
                    int temp=arr[j];
                    arr[j]=j;
                    j=temp;
                }
                arr[j]=j;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]= {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        method1(arr);
        System.out.println(Arrays.toString(arr));
        int arr2[]= new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        method2(arr2);
        System.out.println(Arrays.toString(arr2));
        int arr3[]= new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        method3(arr3);
        System.out.println(Arrays.toString(arr3));
        int arr4[]= new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        method4(arr4);
        System.out.println(Arrays.toString(arr4));
        int arr5[]= new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        method5(arr5);
        System.out.println(Arrays.toString(arr5));
    }
}
