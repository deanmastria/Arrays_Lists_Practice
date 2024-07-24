package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an value/string, enter 0 to exit ");

        while (true) {
            System.out.println("Enter a value/string: ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("You have not entered a number");
                break;
            }
            list.add(n);
        }
        System.out.println("Enter number you are looking for: ");
        int searchNumber = sc.nextInt();

        int index = list.indexOf(searchNumber);
        if (index != -1) {
            System.out.println("Index of " + searchNumber + " in the list is: " + index);
        } else {
            System.out.println(searchNumber + " is not on the list");
        }
        sc.close();

        }
    }

