package test;

import org.junit.Before;
import org.junit.Test;

import main.RegistrationSystem;
import main.course.Course;
import main.course.Semester;
import main.person.Professor;
import main.person.Student;
import main.person.TeachingAssistant;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
        Professor               professor = new Professor("P001", "John", "Smith");
        List<TeachingAssistant> tas       = new ArrayList<>();

        student1           = new Student("S001", "Easter", "Bunny");
        student2           = new Student("S002", "Santa", "Claus");
        student3           = new Student("S003", "Tooth", "Fairy");
        course1            = new Course("C001", "Mathematics", 2, professor, tas, Semester.FALL, 2023);
        course2            = new Course("C002", "Calculus", 2, professor, tas, Semester.FALL, 2023);
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
