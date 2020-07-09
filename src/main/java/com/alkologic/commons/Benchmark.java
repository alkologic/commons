package com.alkologic.commons;

public class Benchmark {
  public static double go(Runnable runnable) {
    long start = System.currentTimeMillis();

    runnable.run();

    double seconds = (System.currentTimeMillis() - start) / 1000d;
    return Math.round(seconds * 100d) / 100d;
  }
}
