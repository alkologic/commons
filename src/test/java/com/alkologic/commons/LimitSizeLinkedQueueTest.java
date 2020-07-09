package com.alkologic.commons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class LimitSizeLinkedQueueTest  {

  @Test
  public void testAddAndPop() {
    LimitSizeQueue<Integer> queue = new LimitSizeQueue<>(5);
    queue.add(1);
    queue.add(2);
    queue.add(3);
    
    assertEquals(new Integer(1), queue.pop());
    assertEquals(new Integer(2), queue.pop());
    assertEquals(new Integer(3), queue.pop());
    
    assertTrue(queue.isEmpty());
  }
  
  @Test
  public void testMaxSize() {
    LimitSizeQueue<Integer> queue = new LimitSizeQueue<>(3);
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    
    assertEquals(Arrays.asList(3,4,5), queue.elements());
  }

  
}
