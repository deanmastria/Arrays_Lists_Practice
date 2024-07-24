package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter integers, when you are finished enter 0: ");    //user enters integer until 0 is entered

        while (true) {
            System.out.println("Enter an integer: ");
            int input = sc.nextInt();

            if (input == 0) {
                break;
            }

            list.add(input);                                                       //stores inputs
        }
        int sum = getSum(list);                                                     //gets the sum of inputs as integers
        System.out.println("Sum of this list is " + sum);

        sc.close();
    }
    public static int getSum(ArrayList<Integer> list) {                             // method to calculate sum
        int total = 0;
        for (int number : list) {
            total += number;
        }
        return total;
    }
}
