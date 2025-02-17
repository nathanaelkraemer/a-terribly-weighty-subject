package org.example;

public class Converter {
  // Your code goes here
  String toPounds(int x){
    double y = 0.0000;
    y = x/16.0000;
    return y + " lbs";
  }
  String toPoundsAndOunces(int x){
    int y = 0;
    int z = 0;
    y = x/16;
    z = x%16;
    return y + " lbs " + z + " oz";
  }
}
