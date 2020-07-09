package com.alkologic.commons;

import org.junit.Test;
import com.alkologic.commons.exceptions.AlreadyRunnningException;

public class SingleInstanceTest {

  @Test(expected = AlreadyRunnningException.class)
  public void testExitIfRunning() {
    SingleInstance.exitIfRunning(32132);
    SingleInstance.exitIfRunning(32132);
  }

  @Test(expected = Test.None.class)
  public void testExitIfRunningDiffPort() {
    SingleInstance.exitIfRunning(32134);
    SingleInstance.exitIfRunning(32135);
  }
}
