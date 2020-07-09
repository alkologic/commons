package com.alkologic.commons;

import static org.junit.Assert.*;
import org.junit.Test;

public class FormattersTest {

  @Test
  public void testFormatDouble() {
    assertEquals("0.034", Formatters.formatDouble(0.0335d, 3));
  }

}