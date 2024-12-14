package org.example;

import java.sql.SQLOutput;

/**
 * Simple sorting algorithms and their performance 
 * Reg: 
 *
 */

public class Sort {

    //create an array of given size and populate it with random data  
    static int [] create_rand_data(int size_of_array) {
        int [] data = new int[size_of_array];
        int i;
        for(i=0; i < data.length; i++)
            data[i] = (int)(Math.random() * 100);
        return data;
    }

    //create an array of given size and populate it with worst data arrangement 
    static int [] create_worst_data(int size_of_array) {
        int [] data = new int[size_of_array];
        int i;
        for(i=0; i < data.length; i++)
            data[i] = data.length - i;
        return data;
    }

    //create an array of given size and populate it with best data arrangement 
    static int [] create_best_data(int size_of_array) {
        int [] data = new int[size_of_array];
        int i;
        for(i=0; i < data.length; i++)
            data[i] = i;
        return data;
    }

    // function to swap. Would be useful since all need this 
    static void swap(int []d, int i, int j) {
        int tmp = d[i];
        d[i] = d[j];
        d[j] = tmp;
    }

    // check if the soring worked on the array 
    static boolean isSorted(int [] data) {
        int i;
        for(i=1; i < data.length; i++)
            if(data[i] < data[i-1]) break;
        return (i == data.length);
    }

    // If you want just display the array as well :) 
    static void display(int []data) {
        System.out.println("=======");
        for(int i=0; i < data.length; i++)
            System.out.print(data[i] + "  ");
        System.out.println("\n=======");
    }


    /**********************************************************
     *     Implementation of sorting algorithms               *
     *********************************************************/
    static void bubble_sort(int [] data)  {
        for(int i = 0; i < data.length - 1; i++){
            for(int j = 0; j < data.length - 1 - i; j++){
                if(data[j + 1] < data [j]){
                    swap(data, j , j + 1);
                }
            }
        }
    }

    static void selection_sort(int [] data) {
        for(int i = 0; i < data.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < data.length; j++){
                if(data[j] < data[minIndex]){
                    minIndex = j;
                }
            }
            swap(data, minIndex, i);
        }
    }

    static void insertion_sort(int [] data) {
        for(int i = 1; i < data.length; i++){
            int key = data[i];
            int j = i - 1;

            while(j >= 0 && data[j] > key){
                data[j + 1] = data [j];
                j--;
            }
            data[j + 1] = key;
        }
    }


    public static void main(String [] args) {
        // create arrays of different size populate with data
        // measure the time taken by different algorithms to
        // sort the array.
        // Think about effects of caches, other apps running etc.


        //Bubble sort

        //With 10 elements for an array
        int[] array10ElemenstsRandData = create_rand_data(10);
        int[] array10ElemetsWorstData = create_worst_data(10);
        int[] array10ElementsBestData = create_best_data(10);

        //with 500 elements for an array
        int[] array500ElemenstsRandData = create_rand_data(500);
        int[] array500ElemetsWorstData = create_worst_data(500);
        int[] array500ElementsBestData = create_best_data(500);

        //with 1000 elements for an array
        int[] array1000ElemenstsRandData = create_rand_data(1000);
        int[] array1000ElemetsWorstData = create_worst_data(1000);
        int[] array1000ElementsBestData = create_best_data(1000);


        long startTime;
        long endTime;
        long executiontime;

        System.out.println("=============================================================");
        System.out.println("Bubble Sort sorting Algorithm");
        System.out.println("=============================================================");

        for(int i = 10; i <= 10000; i = i*10){

        }
        //10 elements
        startTime = System.nanoTime();
        bubble_sort(array10ElemenstsRandData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        String sortedOrNot;
        if(isSorted(array10ElemenstsRandData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 10, Random data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        bubble_sort(array10ElemetsWorstData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array10ElemetsWorstData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 10, Worst data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        bubble_sort(array10ElementsBestData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array10ElementsBestData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 10, Best data, " + sortedOrNot + ", Excution Time: " + executiontime);

        System.out.println(" ");

        //500 elements
        startTime = System.nanoTime();
        bubble_sort(array500ElemenstsRandData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array500ElemenstsRandData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 500, Random data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        bubble_sort(array500ElemetsWorstData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array500ElemetsWorstData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 500, Worst data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        bubble_sort(array500ElementsBestData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array500ElementsBestData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 500, Best data, " + sortedOrNot + ", Excution Time: " + executiontime);

        System.out.println(" ");


        //1000 elements
        startTime = System.nanoTime();
        bubble_sort(array1000ElemenstsRandData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array1000ElemenstsRandData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 1000, Random data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        bubble_sort(array1000ElemetsWorstData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array1000ElemetsWorstData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 1000, Worst data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        bubble_sort(array1000ElementsBestData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array1000ElementsBestData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 1000, Best data, " + sortedOrNot + ", Excution Time: " + executiontime);

        System.out.println(" ");


        //Selection sort

        //With 10 elements for an array
        array10ElemenstsRandData = create_rand_data(10);
        array10ElemetsWorstData = create_worst_data(10);
        array10ElementsBestData = create_best_data(10);

        //with 500 elements for an array
        array500ElemenstsRandData = create_rand_data(500);
        array500ElemetsWorstData = create_worst_data(500);
        array500ElementsBestData = create_best_data(500);

        //with 1000 elements for an array
        array1000ElemenstsRandData = create_rand_data(1000);
        array1000ElemetsWorstData = create_worst_data(1000);
        array1000ElementsBestData = create_best_data(1000);

        System.out.println("=============================================================");
        System.out.println("Selection Sort sorting Algorithm");
        System.out.println("=============================================================");

        //10 elements
        startTime = System.nanoTime();
        selection_sort(array10ElemenstsRandData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array10ElemenstsRandData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 10, Random data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        selection_sort(array10ElemetsWorstData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array10ElemetsWorstData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 10, Worst data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        selection_sort(array10ElementsBestData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array10ElementsBestData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 10, Best data, " + sortedOrNot + ", Excution Time: " + executiontime);

        System.out.println(" ");

        //500 elements
        startTime = System.nanoTime();
        selection_sort(array500ElemenstsRandData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array500ElemenstsRandData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 500, Random data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        selection_sort(array500ElemetsWorstData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array500ElemetsWorstData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 500, Worst data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        selection_sort(array500ElementsBestData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array500ElementsBestData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 500, Best data, " + sortedOrNot + ", Excution Time: " + executiontime);

        System.out.println(" ");


        //1000 elements
        startTime = System.nanoTime();
        selection_sort(array1000ElemenstsRandData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array1000ElemenstsRandData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 1000, Random data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        selection_sort(array1000ElemetsWorstData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array1000ElemetsWorstData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 1000, Worst data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        selection_sort(array1000ElementsBestData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array1000ElementsBestData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 1000, Best data, " + sortedOrNot + ", Excution Time: " + executiontime);

        System.out.println(" ");


        //insertion sort

        //With 10 elements for an array
        array10ElemenstsRandData = create_rand_data(10);
        array10ElemetsWorstData = create_worst_data(10);
        array10ElementsBestData = create_best_data(10);

        //with 1000 elements for an array
        array500ElemenstsRandData = create_rand_data(500);
        array500ElemetsWorstData = create_worst_data(500);
        array500ElementsBestData = create_best_data(500);

        //with 100000 elements for an array
        array1000ElemenstsRandData = create_rand_data(1000);
        array1000ElemetsWorstData = create_worst_data(1000);
        array1000ElementsBestData = create_best_data(1000);

        System.out.println("=============================================================");
        System.out.println("Insertion Sort sorting Algorithm");
        System.out.println("=============================================================");

        //10 elements
        startTime = System.nanoTime();
        insertion_sort(array10ElemenstsRandData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

         if(isSorted(array10ElemenstsRandData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 10, Random data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        insertion_sort(array10ElemetsWorstData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array10ElemetsWorstData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 10, Worst data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        insertion_sort(array10ElementsBestData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array10ElementsBestData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 10, Best data, " + sortedOrNot + ", Excution Time: " + executiontime);

        System.out.println(" ");

        //500 elements
        startTime = System.nanoTime();
        insertion_sort(array500ElemenstsRandData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array500ElemenstsRandData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 500, Random data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        insertion_sort(array500ElemetsWorstData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array500ElemetsWorstData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 500, Worst data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        insertion_sort(array500ElementsBestData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array500ElementsBestData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 500, Best data, " + sortedOrNot + ", Excution Time: " + executiontime);

        System.out.println(" ");


        //1000 elements
        startTime = System.nanoTime();
        insertion_sort(array1000ElemenstsRandData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array1000ElemenstsRandData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 1000, Random data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        insertion_sort(array1000ElemetsWorstData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array1000ElemetsWorstData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 1000, Worst data, " + sortedOrNot + ", Excution Time: " + executiontime);


        startTime = System.nanoTime();
        insertion_sort(array1000ElementsBestData);
        endTime = System.nanoTime();
        executiontime = endTime - startTime ;

        if(isSorted(array1000ElementsBestData)){
            sortedOrNot = "Sorted";
        }
        else{
            sortedOrNot = "Not Sorted";
        }
        System.out.println("No. of elemets = 1000, Best data, " + sortedOrNot + ", Excution Time: " + executiontime);

        System.out.println(" ");

    }
}