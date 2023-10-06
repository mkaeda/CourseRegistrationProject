package test.id;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.id.CourseCode;

public class CourseCodeTest
{
    @Test
    public void testValidCourseCode()
    {
        CourseCode courseCode = new CourseCode("123");
        assertEquals("C123", courseCode.getValue());
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullCourseCodeNonNumeric()
    {
        new CourseCode(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCourseCodeNonNumeric()
    {
        new CourseCode("12A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCourseCodeLength()
    {
        new CourseCode("1234");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCourseCodeNonNumeric2()
    {
        new CourseCode("12 3");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCourseCodeNonNumeric3()
    {
        new CourseCode("1234A");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCourseCodeEmpty()
    {
        new CourseCode("");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCourseCodeBlank()
    {
        new CourseCode(" \t\s");
    }
}
