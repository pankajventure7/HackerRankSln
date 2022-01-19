package com.company;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int n ,temp;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int array[] = new int[n];
        for(int i =0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        for(int i =0;i<array.length-1;i++){

            if(array[i]>array[i+1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }

        }
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
