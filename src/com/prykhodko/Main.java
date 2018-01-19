package com.prykhodko;



import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        int[]sortedArray = sortIntegers(array);
        printArray(sortedArray);

//        System.out.println("Enter the numbers: ");



    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer numbers: \r");
        int[] array = new int[number];

        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){

        int counter = 0;
        for(int item : array){
            System.out.println("Element # " + counter + " has value " + item);
            counter++;

        }

//        for(int i=0; i<array.length; i++){
//            System.out.println("Element # " + i + " has value: " + array[i]);
//        }
    }

    public static int[] sortIntegers(int[] array){

        int temp;

        int[] sortedArray = Arrays.copyOf(array, array.length);

//        int[]sortedArray = new int[array.length];
//
//        for(int i=0; i<array.length; i++){
//            sortedArray[i] = array[i];
//        }

        boolean flag = true;
        while(flag){
            flag = false;

        for(int i=0; i<array.length-1; i++) {
            if (sortedArray[i] < sortedArray[i+1]) {
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
                flag = true;
            }
        }
        }
            return sortedArray;
    }
}
