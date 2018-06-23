package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */

//Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
public class PlaceElementAtEvenOddPos {
    public static void rearrange(int arr[]){
        int resulantArray[]=new int[arr.length];
        Arrays.sort(arr);
        int j = ((arr.length+1)/2)-1;
        int k= j+1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                resulantArray[i]=arr[j];
                j--;
            }else{
                resulantArray[i]=arr[k];
                k++;
            }
        }
        System.arraycopy(resulantArray,0,arr,0,arr.length);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));

        int arr2[] = {1, 2, 1, 4, 5, 6, 8, 8};
        rearrange(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
