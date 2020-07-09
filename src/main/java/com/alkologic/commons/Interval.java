package com.alkologic.commons;

import java.time.Duration;
import java.time.Instant;

import lombok.EqualsAndHashCode;
import lombok.ToString;

// inclusive interval
// when initialized with long , min unit is second
// when initialized with instnat , min unit is nano second
@ToString
@EqualsAndHashCode
public class Interval {
  private final Instant from;
  private final Instant to;

  public Interval(long from, long to) {
    this.from = Instant.ofEpochSecond(from);
    this.to = Instant.ofEpochSecond(to);
  }

  public Interval(Instant from, Instant to) {
    this.from = from;
    this.to = to;
  }

  public Instant getFrom() {
    return from;
  }

  public Instant getTo() {
    return to;
  }

  public long getFromSeconds() {
    return from.getEpochSecond();
  }

  public long getToSeconds() {
    return to.getEpochSecond();
  }

  public Duration getDuration() {
    return Duration.between(from, to);
  }

  public boolean isIn(long val) {
    return (getFromSeconds() <= val && val <= getToSeconds());
  }

}
