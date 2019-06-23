package com.company;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {12,56,23,76,-45,3};
        int[] sortedArray = {12,45,67,888,999};
        //System.out.println(linearSearch(intArray,31));
        System.out.println(binarySearch(sortedArray,999));

    }


    public static int linearSearch(int[] input, int value){
        for(int i=0; i<input.length; i++){
            if(input[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] input, int value){
        int beg = 0;
        int last = input.length - 1;

        while(beg<=last){

            int mid = (beg + last)/2;
            if(input[mid] == value){
                return mid;
            }else if(input[mid] > value){
                last = mid - 1;
            }else{
                beg = mid + 1;
            }

        }
        return -1;
    }
}
