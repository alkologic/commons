package com.alkologic.commons;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HexTest {

  @Test
  public void testBytesToHex() {
    byte bytes[] = new byte[] {0, 114, 0, -68, 79, -14, 0, 0, 28, 104, 121, -84, -90, -58, 64, 73,
        81, -125, 64, 9, 42, 48, 85, 50, 97, 124};

    assertEquals("007200BC4FF200001C6879ACA6C64049518340092A305532617C", Hex.bytesToHex(bytes));
  }

}
