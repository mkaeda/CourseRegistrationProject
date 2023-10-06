package test.course;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.course.Course;
import main.id.CourseCode;
import main.id.PersonId;
import main.person.Student;

public class CourseTest
{
    private Course  course;
    private Student student1, student2, student3;

    @Before
    public void setUp()
    {
        student1 = new Student(new PersonId("P001"), "Easter", "Bunny");
        student2 = new Student(new PersonId("P002"), "Santa", "Claus");
        student3 = new Student(new PersonId("P003"), "Tooth", "Fairy");
        course   = new Course(new CourseCode("C001"), "Mathematics", 2);
    }

    @Test
    public void testGetCode()
    {
        assertEquals("C001", course.getCode().getValue());
    }

    @Test
    public void testGetName()
    {
        assertEquals("Mathematics", course.getName());
    }

    @Test
    public void testGetCapacity()
    {
        assertEquals(2, course.getCapacity());
    }

    @Test
    public void testGetEnrolledStudents()
    {
        assertTrue(course.getEnrolledStudents().isEmpty());
    }

    @Test
    public void testEnrollStudent()
    {
        List<Student> students;

        assertTrue(course.enrollStudent(student1));

        students = course.getEnrolledStudents();
        assertEquals(1, students.size());
        assertEquals(student1, students.get(0));

        assertTrue(course.enrollStudent(student2));

        students = course.getEnrolledStudents();
        assertEquals(2, course.getEnrolledStudents().size());
        assertEquals(student1, students.get(0));
        assertEquals(student2, students.get(1));

        assertFalse(course.enrollStudent(student3));
    }

    @Test
    public void testUnenrollStudent()
    {
        List<Student> students;

        assertTrue(course.enrollStudent(student1));
        assertTrue(course.enrollStudent(student2));

        assertTrue(course.unenrollStudent(student1));

        students = course.getEnrolledStudents();
        assertEquals(1, students.size());
        assertEquals(student2, students.get(0));

        assertFalse(course.unenrollStudent(student3));
    }
}
