package com.Icekid;

import java.util.Scanner;

public class Main {
private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the array \r");
        int size = scan.nextInt();
        int[] arr= readIntegers(size);
        System.out.println("Given Array");
        printArray(arr);

        Mergesort ob = new Mergesort();
        ob.sort(arr,0,arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int[] readIntegers(int count){
        int[] capacity = new int[count];
        System.out.println("Enter "+ count + " integer values \r");
        for(int i = 0; i< capacity.length; i++){
            capacity[i] = scan.nextInt();
        }
        return capacity;

    }


}
