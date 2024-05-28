package org.learning.teams;

import org.learning.teams.exceptions.InvalidAgeException;
import org.learning.teams.exceptions.InvalidNameException;

public class Person {

  // ATTRIBUTI
  private final String name;
  private final int age;

  public Person(String name, int age) throws InvalidAgeException, InvalidNameException {
    if (name == null || name.isEmpty()) {
      throw new InvalidNameException("Name: " + name);
    }
    if (age < 0 || age > 130) {
      throw new InvalidAgeException("Age: " + age);
    }
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public final boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Person person)) {
      return false;
    }

    return getAge() == person.getAge() && getName().equals(person.getName());
  }

  @Override
  public int hashCode() {
    int result = getName().hashCode();
    result = 31 * result + getAge();
    return result;
  }
}
