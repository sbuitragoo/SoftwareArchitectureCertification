package edu.unisabana.dyas.tdd.registry;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<Integer, Person> voters = new HashMap<>();

    public RegisterResult registerVoter(Person person) {

        if (!person.isAlive() && person.getAge() == 0 && person.getId() == 0) {
            return RegisterResult.NOT_ASSIGNED;
        }

        if (!person.isAlive()) {
            return RegisterResult.DEAD;
        }

        if (person.getAge() < 0) {
            return RegisterResult.INVALID_AGE;
        }

        if (person.getAge() < 18) {
            return RegisterResult.UNDERAGE;
        }

        if (voters.containsKey(person.getId())) {
            return RegisterResult.DUPLICATED;
        }

        voters.put(person.getId(), person);

        return RegisterResult.VALID;
    }
}
