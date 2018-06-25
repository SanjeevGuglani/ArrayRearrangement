package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */

//Rearrange positive and negative numbers in O(n) time and O(1) extra space
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

    //O(nlogn)
    //O(n)
    //order not maintain
    public static void rearrange2(int arr[]){
        int tempArray[]=new int[arr.length];
        boolean positive=false;
        Arrays.sort(arr);
        int i,j,k=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]>0)
                break;
        }
        j=i-1;
        while (k<arr.length){
            positive=!positive;
            if(positive && i<arr.length){
                tempArray[k]=arr[i];
                i++;
                k++;
            }else if(!positive && j>=0){
                tempArray[k]=arr[j];
                j--;
                k++;
            }
        }
        System.arraycopy(tempArray,0,arr,0,arr.length);
    }


    //O(n)
    //O(1)
    //order not maintain
    public static void rearrange3(int arr[]){
      //First of all instead of sorting rearrange array so that all negative number are at front
        //and all positive at back in O(n)
        //check this
        int i=0,j=0,temp;
        for(i=0;i<arr.length;i++){
            if(arr[i]<0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        if(j==0 || j==arr.length) return;

        //Now we have array where negative are at front and pos at end
        //now instead of copy array which require O(n) space use this

        for(i=0;i<arr.length;i=i+2){
            if(j==arr.length) break;
            temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            j++;
        }
    }



    public static void main(String[] args) {

        System.out.println("**********Method 1*********");
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


        System.out.println("**********Method 2*********");
        int arr4[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        rearrange2(arr4);
        System.out.println(Arrays.toString(arr4));
        int arr5[] = {-1, -2, -3, 4, 5, -6, -7, 8, 9};
        rearrange2(arr5);
        System.out.println(Arrays.toString(arr5));
        int arr6[] = {-1, -2, -3, -4, -5, -6, -7, -8, -9};
        rearrange2(arr6);
        System.out.println(Arrays.toString(arr6));
        int arr7[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rearrange2(arr7);
        System.out.println(Arrays.toString(arr7));


        System.out.println("**********Method 3*********");
        int arr8[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        rearrange3(arr8);
        System.out.println(Arrays.toString(arr8));
        int arr9[] = {-1, -2, -3, 4, 5, -6, -7, 8, 9};
        rearrange3(arr9);
        System.out.println(Arrays.toString(arr9));
        int arr10[] = {-1, -2, -3, -4, -5, -6, -7, -8, -9};
        rearrange3(arr10);
        System.out.println(Arrays.toString(arr10));
        int arr11[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rearrange3(arr11);
        System.out.println(Arrays.toString(arr11));

    }
}
