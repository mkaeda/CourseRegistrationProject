package test.id;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.id.StudentId;

public class StudentIdTest
{
    @Test
    public void testValidCourseCode()
    {
        StudentId id = new StudentId("S123");
        assertEquals("S123", id.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCourseCodeNonNumeric()
    {
        new StudentId("12A");
    }

    @Test(expected = NullPointerException.class)
    public void testNullPersonIdNonNumeric()
    {
        new StudentId(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPersonIdLength()
    {
        new StudentId("1234");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPersonIdNonNumeric2()
    {
        new StudentId("12 3");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPersonIdNonNumeric3()
    {
        new StudentId("1234A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPersonIdEmpty()
    {
        new StudentId("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPersonIdBlank()
    {
        new StudentId(" \t\s");
    }
}
