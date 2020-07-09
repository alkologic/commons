package com.alkologic.commons;

import static org.junit.Assert.*;

import java.time.Duration;
import java.time.Instant;

import org.junit.Test;

public class IntervalTest {

  @Test
  public void testGetDuration() {
    Interval in = new Interval(Instant.ofEpochSecond(0l), Instant.ofEpochSecond(60l));

    assertEquals(Duration.ofMinutes(1), in.getDuration());
  }

  @Test
  public void testIsIn() {
    Interval in = new Interval(0, 1031231232132l);

    assertTrue(in.isIn(151l));
    assertTrue(in.isIn(0l));
    assertTrue(in.isIn(1031231232132l));

    assertFalse(in.isIn(1031231232133l));
  }

}
