/**
 * @class: Convert
 * @author: Max Painter
 * @written: February 7, 2023
 * description: Write a program that convert a given total number of seconds into hours, minutes and seconds
 */

import java.util.Scanner;

public class Convert {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
        System.out.println("Enter a total number of seconds: ");
    int number = input.nextInt();
    int hours = number / 3600;
    int minutes = (number%3600) / 60;
    int seconds = number % 60;
        System.out.print("If the total of number is "+number+", it is "+hours+" hours,"+minutes+" minutes and "+seconds+" seconds.");


}
    }

