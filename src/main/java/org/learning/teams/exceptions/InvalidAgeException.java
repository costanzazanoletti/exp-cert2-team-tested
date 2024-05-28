package org.learning.teams.exceptions;

public class InvalidAgeException extends IllegalArgumentException {

  public InvalidAgeException(String s) {
    super(s);
  }
}
