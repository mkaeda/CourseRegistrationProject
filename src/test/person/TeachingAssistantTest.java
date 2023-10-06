package test.person;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.person.TeachingAssistant;

public class TeachingAssistantTest
{
    private TeachingAssistant ta;

    @Before
    public void setUp()
    {
        ta = new TeachingAssistant("TA001", "John", "Doe");
    }

    @Test
    public void testGetId()
    {
        assertEquals("TA001", ta.getId());
    }

    @Test
    public void testGetFirstName()
    {
        assertEquals("John", ta.getFirstName());
    }

    @Test
    public void testGetLastName()
    {
        assertEquals("Doe", ta.getLastName());
    }

    @Test
    public void testFullName()
    {
        assertEquals("John Doe", ta.getFirstName() + " " + ta.getLastName());
    }
}
