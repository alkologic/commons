package com.alkologic.commons;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.Test;
import lombok.val;

public class CTest {
  @Test
  public void isEmptyTest() {
    assertTrue(C.isEmpty(""));
    assertTrue(C.isEmpty(null));
    assertFalse(C.isEmpty("something"));
  }

  @Test
  public void isCollectionEmptyTest() {
    assertTrue(C.isCollectionEmpty(Arrays.asList()));
    assertTrue(C.isCollectionEmpty(null));
    assertFalse(C.isCollectionEmpty(Arrays.asList("some")));
  }

  @Test
  public void isMapEmpty() {
    assertTrue(C.isMapEmpty(new HashMap<String, String>()));
    assertTrue(C.isCollectionEmpty(null));
    
    val map = new HashMap<Integer, String>();
    map.put(1, "some text");
    assertFalse(C.isCollectionEmpty(Arrays.asList("some")));
  }
}
