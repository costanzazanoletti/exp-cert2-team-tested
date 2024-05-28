package org.learning.teams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeamTest {

  Team team;

  @BeforeEach
  void initTeam() {
    System.out.println("Init team");
    team = new Team();
  }

  @Test
  void addNullMember() {
    //Team team = new Team();
    assertThrows(IllegalArgumentException.class, () -> team.addMember(null));
  }

  @Test
  void addMember() {
    //Team team = new Team();
    assertTrue(team.addMember(new Person("Jane", 33)));
    assertEquals(1, team.getTeamSize());
    assertTrue(team.addMember(new Person("John", 27)));
    assertEquals(2, team.getTeamSize());
    assertFalse(team.addMember(new Person("Jane", 33)));
    assertEquals(2, team.getTeamSize());
  }

  @Test
  void filterMembersByName() {
  }
}