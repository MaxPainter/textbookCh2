/**
 * @class: Cylinder
 * @author: Max Painter
 * @written: February 2, 2023
 * description: Write a program that calculates the base area and volume of a cylinder.
 */

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Radius: ");
        double radius = input.nextDouble();

        System.out.println("Lenght: ");
        double length = input.nextDouble();

        double baseArea = Math.PI * radius * radius;// formula for the base area of a cylinder
        System.out.println("Base area = " + baseArea);

        double volume = Math.PI * radius * radius * length;// formula for the volume of a cylinder
        System.out.println("Volume = " + volume);

    }
}
