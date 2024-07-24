package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
    ArrayList<String> list =  new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Items, enter an empty input to see last item on list");

    while (true) {
        System.out.print("Enter an item: ");
        String input = sc.nextLine();

        if (input.isEmpty()) {
            if (!list.isEmpty()) {
                System.out.println(list.get(list.size() - 1));                              //gets the last item before the empty input
            } else {
                System.out.println("No item found");
            }
            break;
        }
        list.add(input);
    }
    sc.close();
    }
}
