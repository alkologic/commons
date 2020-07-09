package com.alkologic.commons;

import static org.junit.Assert.*;
import org.junit.Test;
import lombok.val;

public class StringNonEmptyJoinerTest {

  @Test
  public void test() {
    val stringNonEmptyJoiner = new StringNonEmptyJoiner("&");

    stringNonEmptyJoiner.add("1").add("2").add("").add(null).add("3");
    assertEquals("1&2&3", stringNonEmptyJoiner.toString());
  }
 
}
