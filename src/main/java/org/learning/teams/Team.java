package org.learning.teams;

import java.util.ArrayList;
import java.util.List;

public class Team {

  private List<Person> members;

  public Team() {
    members = new ArrayList<>();
  }

  // metodo che ritorna la dimensione del team
  public int getTeamSize() {
    return members.size();
  }

  // metodo che aggiunge un membro al team
  public boolean addMember(Person person) throws IllegalArgumentException {
    // 1. valore non valido -> solleva eccezione
    if (person == null) {
      throw new IllegalArgumentException("Person is null");
    }
    // 2. membro esistente -> metodo ritorna false e dimensione inalterata
    if (members.contains(person)) {
      return false;
    } else {
      // 3. membro non esistente -> dimensione aumentata di 1
      members.add(person);
      return true;
    }

  }

  // metodo che restituisce tutti i membri con il nome passato come parametro
  public List<Person> filterMembersByName(String name) {
    List<Person> result = new ArrayList<>();
    for (Person member : members) {
      if (name.equalsIgnoreCase(member.getName())) {
        result.add(member);
      }
    }
    return result;
  }
}
