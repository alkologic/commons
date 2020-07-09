package com.alkologic.commons;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class LimitSizeQueue<E> {

  @Getter
  private int maxSize;
  private LinkedList<E> elements = new LinkedList<>();

  public LimitSizeQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  public E pop() {
    return elements.pop();
  }

  public void add(E e) {
    if (getMaxSize() == elements.size()) {
      elements.pop();
    }

    elements.add(e);
  }

  public Iterator<E> iterator() {
    return elements.iterator();
  }

  public List<E> elements() {
    return Collections.unmodifiableList(elements);
  }

  public boolean isEmpty() {
    return elements.isEmpty();
  }
}
