package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();                            //creates array to be stored
        Scanner sc = new Scanner(System.in);                                    //scanner created to read user input

        System.out.println("Enter an value/string, enter 0 to exit ");

        while (true) {                                                          //starts infinite loop
            System.out.println("Enter a value/string: ");
            int n = sc.nextInt();

            if (n == 0) {                                                       //checks for inputs
                System.out.println("You have not entered a number");
                break;
            }
            list.add(n);
        }
        System.out.println("Enter number you are looking for: ");
        int searchNumber = sc.nextInt();

        int index = list.indexOf(searchNumber);
        if (index != -1) {                                                                  //if input exists, index and of input will be printed
            System.out.println("Index of " + searchNumber + " in the list is: " + index);
        } else {
            System.out.println(searchNumber + " is not on the list");
        }
        sc.close();

        }
    }

