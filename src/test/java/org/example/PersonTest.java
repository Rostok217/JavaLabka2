
package org.example;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testEqualsVerifier() {
        EqualsVerifier.forClass(Person.class).verify();
    }

    @Test
    void testEqualPersons() {
        Person p1 = new Person("Іваненко", "Іван", 20);
        Person p2 = new Person("Іваненко", "Іван", 20);

        assertEquals(p1, p2);
    }

    @Test
    void testDifferentPersons() {
        Person p1 = new Person("Іваненко", "Іван", 20);
        Person p2 = new Person("Петренко", "Петро", 21);

        assertNotEquals(p1, p2);
    }

    @Test
    void testNullComparison() {
        Person person = new Person("Іваненко", "Іван", 20);

        assertNotEquals(person, null);
    }

    @Test
    void testHashCode() {
        Person p1 = new Person("Іваненко", "Іван", 20);
        Person p2 = new Person("Іваненко", "Іван", 20);

        assertEquals(p1.hashCode(), p2.hashCode());
    }
}
