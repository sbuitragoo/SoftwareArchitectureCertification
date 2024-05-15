package edu.unisabana.dyas.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private final Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {
        Person person = new Person("Person", 0, 40, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateIsAlive() {
        Person person = new Person("Person1", 1, 20, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateUnderAge() {
        Person person = new Person("Person2", 2, 15, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateInvalidAge() {
        Person person = new Person("Person3", 3, -2, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validate() {
        Person person = new Person("Person4", 4, 20, Gender.FEMALE, true);
        Person person1 = new Person("Person5", 4, 30, Gender.MALE, true);
        registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }

    @Test
    public void validateNotAssigned() {
        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.NOT_ASSIGNED, result);
    }
}
