package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();                             //stores the object of type arraylist
        Scanner sc = new Scanner(System.in);                                    //created scanner object to read the input

        System.out.println("Enter at least 5 phrases/words ");      //prints the String
        while (true) {                                                          //while loop started
            System.out.println("Enter the phrases/words: ");
            String input = sc.nextLine();                                       //Reads user input

            if (input.isEmpty()) {                                              //checks if user input is empty, if so, run is ended
                break;
            }
            list.add(input);                                                    //adds the input to the list

        }

        if (list.size() >= 5) {                                                 //prints the foll0wing if the conditions here are met


            System.out.println("the fifth item is " + list.get(4));
        } else {

            System.out.println("Less than 5 items have been entered.");
        }
        sc.close();


    }
}
