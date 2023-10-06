package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.RegistrationSystem;
import main.course.Course;
import main.id.CourseCode;
import main.id.PersonId;
import main.person.Student;

public class RegistrationSystemTest
{
    private RegistrationSystem registrationSystem;
    private Course             course1, course2;
    private Student            student1;
    private Student            student2;
    private Student            student3;

    @Before
    public void setUp()
    {
        student1           = new Student(new PersonId("P001"), "Easter", "Bunny");
        student2           = new Student(new PersonId("P002"), "Santa", "Claus");
        student3           = new Student(new PersonId("P003"), "Tooth", "Fairy");
        course1            = new Course(new CourseCode("C001"), "Mathematics", 2);
        course2            = new Course(new CourseCode("C002"), "Calculus", 2);
        registrationSystem = new RegistrationSystem();
        registrationSystem.addCourse(course1);
    }

    @Test
    public void testGetCourses()
    {
        assertEquals(1, registrationSystem.getCourses().size());
        assertEquals(course1, registrationSystem.getCourses().get("C001"));
    }

    @Test
    public void testRegisterStudent()
    {
        assertTrue(registrationSystem.registerStudent("C001", student1));

        List<Student> students = course1.getEnrolledStudents();
        assertEquals(1, students.size());
        assertEquals(student1, students.get(0));

        assertTrue(registrationSystem.registerStudent("C001", student2));

        students = course1.getEnrolledStudents();
        assertEquals(2, students.size());
        assertEquals(student1, students.get(0));
        assertEquals(student2, students.get(1));

        assertFalse(registrationSystem.registerStudent("C001", student3));

        students = course1.getEnrolledStudents();
        assertEquals(2, students.size());
        assertEquals(student1, students.get(0));
        assertEquals(student2, students.get(1));
    }

    @Test
    public void testRegisterStudentUnkownCourse()
    {
        assertFalse(registrationSystem.registerStudent("C002", student2));
        List<Student> students2 = course2.getEnrolledStudents();
        assertTrue(students2.isEmpty());
    }

    @Test
    public void testUnregisterStudent()
    {
        assertTrue(registrationSystem.registerStudent("C001", student1));
        assertTrue(registrationSystem.registerStudent("C001", student2));

        assertTrue(registrationSystem.unregisterStudent("C001", student1));

        List<Student> students = course1.getEnrolledStudents();
        assertEquals(1, students.size());
        assertEquals(student2, students.get(0));

        assertFalse(registrationSystem.unregisterStudent("C001", student3));

        students = course1.getEnrolledStudents();
        assertEquals(1, students.size());
    }

    @Test
    public void testUnregisterStudentUnkownCourse()
    {
        assertFalse(registrationSystem.unregisterStudent("C002", student2));
        List<Student> students2 = course2.getEnrolledStudents();
        assertTrue(students2.isEmpty());
    }
}
