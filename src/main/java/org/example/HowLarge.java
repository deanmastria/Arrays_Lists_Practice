package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();                 //initialize list to store inputs
        Scanner sc = new Scanner(System.in);                        //initialize scanner object to read inputs

        System.out.println("Please enter your input: ");

        while (true) {                                              //infinite loop to ask for inputs
            System.out.println("Enter: ");
            String input = sc.nextLine();                           //reads line of input

            if (input.isEmpty()) {                                 //stops if string is empty
                break;
        }
            list.add(input);                                        //adds the input to the list if not empty

        }
        System.out.println(list.size());                            //prints the size of list after break
        sc.close();
    }
}
