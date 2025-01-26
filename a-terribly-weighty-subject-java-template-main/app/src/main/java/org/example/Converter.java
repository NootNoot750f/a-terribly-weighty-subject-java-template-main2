package org.example;

public class Converter {
  public String toPounds(int ounces) {
    double pounds = ounces / 16.0;
    return String.format("%.4f lbs", pounds);
}
public String toPoundsAndOunces(int ounces){
  int pounds = ounces / 16;
  int remainingOunces = ounces % 16;
  return pounds + (pounds == 1 ? " lb " : " lbs ") + remainingOunces + " oz";
}
}
