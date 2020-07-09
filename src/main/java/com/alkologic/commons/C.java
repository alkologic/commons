package com.alkologic.commons;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class C {
  // shortcuts
  public static void p(Object o) {
    System.out.println(o);
  }

  public static void pa(Object[] a) {
    C.p(Arrays.toString(a));
  }

  // empty checks
  public static boolean isEmpty(String s) {
    return s == null || s.isEmpty();
  }

  public static <E> boolean isCollectionEmpty(Collection<E> c) {
    return c == null || c.isEmpty();
  }

  public static <K, V> boolean isMapEmpty(Map<K, V> m) {
    return m == null || m.isEmpty();
  }

  public static String getStackTrace(Exception ex) {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    ex.printStackTrace(pw);
    return sw.toString();
  }
}
