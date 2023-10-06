package test.person;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.id.PersonId;
import main.person.Student;

public class StudentTest
{
    private Student student;

    @Before
    public void setUp()
    {
        student = new Student(new PersonId("P001"), "John", "Doe");
    }

    @Test
    public void testGetId()
    {
        assertEquals("P001", student.getId().getValue());
    }

    @Test
    public void testGetFirstName()
    {
        assertEquals("John", student.getFirstName());
    }

    @Test
    public void testGetLastName()
    {
        assertEquals("Doe", student.getLastName());
    }

    @Test
    public void testFullName()
    {
        assertEquals("John Doe", student.getFirstName() + " " + student.getLastName());
    }
}
