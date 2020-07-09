package com.alkologic.commons;

import java.util.StringJoiner;

public class StringNonEmptyJoiner {
  // Stringjoiner class is final, cannot extend
  private final StringJoiner stringJoiner;

  public StringNonEmptyJoiner(CharSequence delimiter) {
    this.stringJoiner = new StringJoiner(delimiter);
  }

  public StringNonEmptyJoiner add(String value) {
    if (!C.isEmpty(value)) {
      stringJoiner.add(value);
    }
    return this;
  }
  
  @Override
  public String toString() {
    return stringJoiner.toString();
  } 
}
