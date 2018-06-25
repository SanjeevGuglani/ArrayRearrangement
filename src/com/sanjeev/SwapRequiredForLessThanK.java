package com.sanjeev;



/**
 * Created by Sanjeev Guglani
 */
public class SwapRequiredForLessThanK {
    //O(n)
    //Learn sliding window technique
    public static  int  swapRequired(int arr[],int k){
        int countLessThanK=0;
        int badCount=0,currentBadCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k) countLessThanK++;
        }

        for(int i=0;i<countLessThanK;i++){
            if(arr[i]>k){
                badCount++;
                currentBadCount++;
            }
        }
        for(int i=1,j=countLessThanK;j<arr.length;j++,i++){
            //Decrement bad count from previous winow
            if(arr[i-1]>k){
                currentBadCount--;
            }

            //Increment bad count from current window
            if(arr[j]>k){
                currentBadCount++;
            }
            badCount = Math.min(currentBadCount,badCount);
        }
        return badCount;

    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 3};
        int k = 3;
        System.out.print(swapRequired(arr, k) + "\n");

        int arr1[] = {2, 7, 9, 5, 8, 7, 4};
        k = 5;
        System.out.print(swapRequired(arr1, k)+"\n");

        int arr2[] = {2, 7, 9, 5, 8, 7, 4};
        k = 7;
        System.out.println(swapRequired(arr2, k));


        int arr3[] = {2, 7, 9, 5, 8, 3, 4};
        k = 4;
        System.out.print(swapRequired(arr3, k));
    }

}
