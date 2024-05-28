package org.learning.teams.exceptions;

public class InvalidNameException extends IllegalArgumentException {

  public InvalidNameException(String s) {
    super(s);
  }
}
