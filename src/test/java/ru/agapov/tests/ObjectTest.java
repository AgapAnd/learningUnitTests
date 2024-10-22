package ru.agapov.tests;


import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class ObjectTest {
    @Test
    public void successfullyReturnsStringRepresentationOfItself() {
        Object object = new Object();
        String expectedStringRepresentation = "java.lang.Object@" + Integer.toHexString(object.hashCode());


        String objectStringRepresentation = object.toString();


        assertThat(objectStringRepresentation, equalTo(expectedStringRepresentation));
    }
}
