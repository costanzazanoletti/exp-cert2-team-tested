package org.learning.teams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.learning.teams.exceptions.InvalidAgeException;
import org.learning.teams.exceptions.InvalidNameException;

class PersonTest {

  @Test
  void createValidPerson() {
    Person person = new Person("Jane", 33);
    assertEquals("Jane", person.getName());
    assertEquals(33, person.getAge());
  }

  @Test
  void createPersonWithInvalidName() {
    assertThrows(InvalidNameException.class, () -> new Person(null, 99));
    assertThrows(InvalidNameException.class, () -> new Person("", 99));
  }

  @Test
  void createPersonWithInvalidAge() {
    assertThrows(InvalidAgeException.class, () -> new Person("Jane", -1));
    assertThrows(InvalidAgeException.class, () -> new Person("Jane", 999));
  }
}