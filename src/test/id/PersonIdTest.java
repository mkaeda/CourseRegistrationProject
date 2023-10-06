package test.id;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.id.PersonId;

public class PersonIdTest
{
    @Test
    public void testValidCourseCode()
    {
        PersonId id = new PersonId("P123");
        assertEquals("P123", id.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCourseCodeNonNumeric()
    {
        new PersonId("12A");
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullPersonIdNonNumeric()
    {
        new PersonId(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPersonIdLength()
    {
        new PersonId("1234");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPersonIdNonNumeric2()
    {
        new PersonId("12 3");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPersonIdNonNumeric3()
    {
        new PersonId("1234A");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPersonIdEmpty()
    {
        new PersonId("");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPersonIdBlank()
    {
        new PersonId(" \t\s");
    }
}
