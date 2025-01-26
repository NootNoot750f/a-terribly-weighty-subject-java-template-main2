package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
System.out.println("Hello welcome to the Freedom Units Ounce Conversion Thing!");

    Scanner scanner = new Scanner(System.in);
    System.out.println("How many ounces do you have to convert?: ");
    int ounces = scanner.nextInt();
    System.out.println("Thanks! Converting to pounds.");

    Converter converter = new Converter();
    System.out.println(ounces + " oz is equivalent to " + converter.toPoundsAndOunces(ounces) + ".");
    System.out.println(ounces + " oz is equivalent to " + converter.toPounds(ounces) + ".");
    System.out.println("Thank you for using the converter! Happy Freedom Units!");
    scanner.close();  
  }
}
