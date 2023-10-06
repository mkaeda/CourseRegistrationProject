package test.course;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.course.Course;
import main.person.Professor;
import main.person.Student;
import main.person.TeachingAssistant;

public class CourseTest
{
    private Course                  course;
    private Student                 student1, student2, student3;
    private Professor               professor;
    private List<TeachingAssistant> tas;

    @Before
    public void setUp()
    {
        professor = new Professor("P001", "John", "Smith");
        tas       = new ArrayList<>();
        student1  = new Student("S001", "Easter", "Bunny");
        student2  = new Student("S002", "Santa", "Claus");
        student3  = new Student("S003", "Tooth", "Fairy");
        course    = new Course("C001", "Mathematics", 2);
    }

    @Test
    public void testGetCode()
    {
        assertEquals("C001", course.getCode());
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
    public void testGetProfessor()
    {
        assertEquals(professor, course.getProfessor());
    }

    @Test
    public void testGetTeachingAssistants()
    {
        assertEquals(tas, course.getTeachingAssistants());
        assertTrue(course.getTeachingAssistants().isEmpty());
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
