package ru.agapov;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
 * Class for testing behavior of class Object
 */
public class ObjectTest {
    @Test
    public void successfullyReturnsStringRepresentationOfItself() {
        Object object = new Object();
        String expectedStringRepresentation = "java.lang.Object@" + Integer.toHexString(object.hashCode());
        String objectStringRepresentation = object.toString();

        assertThat(objectStringRepresentation).isEqualTo(expectedStringRepresentation);
    }
}
