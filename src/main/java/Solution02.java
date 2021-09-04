/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 paul kelly
 */

//This program determines the number of characters in a string

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.next();
        System.out.printf("What is the input string? %s \n%s has %d character.\n", string, string, string.length());
    }
}
