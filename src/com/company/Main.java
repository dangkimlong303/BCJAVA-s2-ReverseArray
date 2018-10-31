package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20) ;


            int[] array = new int[size];

            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter element " + (i + 1) + " :");
                array[i] = sc.nextInt();
            }

            System.out.printf("%-20s%s", "Elements in array: ", "");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }

            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }

            System.out.printf("%-20s%s", "Reverse array: ", "");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
        }
    }
