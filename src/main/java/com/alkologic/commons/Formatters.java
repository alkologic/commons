package com.alkologic.commons;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Formatters {
  public static String formatDouble(double value, int precision) {
    String format = "0.";
    for (int i = 0; i < precision; i++) {
      format += "0";
    }
    NumberFormat formatter = new DecimalFormat(format);
    return formatter.format(value);
  }
}
