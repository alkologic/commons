package com.alkologic.commons;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BenchmarkTest {

  @Test
  public void testBenchmark() {
    Runnable runnable = () -> {
      try {
        Thread.sleep(100l);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    assertEquals(0.1d, Benchmark.go(runnable), 0.02d);
  }

}
