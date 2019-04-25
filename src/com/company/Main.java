package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        // System.out.println(colors.get(1));

        // String done = " ";
        String newColor = " ";
        System.out.println("Eneter colort type q when done");
        while (!newColor.equalsIgnoreCase("q")) {
            newColor = scan.nextLine();
            colors.add(newColor);
            //  System.out.println("enter another color press q when done?");
            // done = scan.nextLine();
            // scan.nextLine();

        }
        for (int i = 0; i<colors.size()-1; i++){
            System.out.println(colors.get(i));
        }

        // enhanced forloop prefered way

            for (String colorList : colors) {
                if (!colorList.equalsIgnoreCase("q"))
                    System.out.println(colorList);
            }

    }
}
