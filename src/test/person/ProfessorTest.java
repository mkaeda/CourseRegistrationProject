package test.person;

import org.junit.Before;
import org.junit.Test;

import main.person.Professor;

import static org.junit.Assert.*;

public class ProfessorTest
{
    private Professor professor;

    @Before
    public void setUp()
    {
        professor = new Professor("P001", "John", "Doe");
    }

    @Test
    public void testGetId()
    {
        assertEquals("P001", professor.getId());
    }

    @Test
    public void testGetFirstName()
    {
        assertEquals("John", professor.getFirstName());
    }

    @Test
    public void testGetLastName()
    {
        assertEquals("Doe", professor.getLastName());
    }

    @Test
    public void testFullName()
    {
        assertEquals("John Doe", professor.getFirstName() + " " + professor.getLastName());
    }
}
