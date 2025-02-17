package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("The Ounces to Pounds Converter has began running.");
    System.out.println("Please enter how many ounces you have");
    Scanner obj = new Scanner(System.in);
    int input = obj.nextInt();
    System.out.println("Thank you. The converter is currently working to convert your input");
    //String output = toPounds(input);
    Converter newconverter = new Converter();
    System.out.println(newconverter.toPounds(input));
    System.out.println(newconverter.toPoundsAndOunces(input));
    System.out.println("Thank you for using the Converter! Ounces to Pounds Converter is now closing.");
  }
}
