package main.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.person.Professor;
import main.person.Student;
import main.person.TeachingAssistant;

/**
 * Represents a course offered within an educational institution.
 */
public class Course
{
    private String                  code;
    private String                  name;
    private int                     capacity;
    private Professor               professor;
    private List<TeachingAssistant> tas;
    private List<Student>           enrolledStudents;

    /**
     * Constructs a new course.
     *
     * @param code
     *                  The course code or identifier.
     * @param name
     *                  The name or title of the course.
     * @param capacity
     *                  The maximum number of students that can enroll in the
     *                  course.
     * @param professor
     *                  The professor responsible for teaching the course.
     * @param tas
     *                  The list of teaching assistants associated with the course.
     * @param semester
     *                  The semester in which the course is offered (e.g., FALL,
     *                  WINTER, SPRING, SUMMER).
     * @param year
     *                  The year in which the course is offered.
     */
    public Course(String code, String name, int capacity)
    {
        this.code             = code;
        this.name             = name;
        this.capacity         = capacity;
        this.professor        = professor;
        this.tas              = tas;
        this.enrolledStudents = new ArrayList<>();
    }

    /**
     * Gets the course code.
     *
     * @return The course code.
     */
    public String getCode()
    {
        return code;
    }

    /**
     * Gets the name or title of the course.
     *
     * @return The course name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the maximum capacity of students that can enroll in the course.
     *
     * @return The course capacity.
     */
    public int getCapacity()
    {
        return capacity;
    }

    /**
     * Gets the professor responsible for teaching the course.
     *
     * @return The course professor.
     */
    public Professor getProfessor()
    {
        return professor;
    }

    /**
     * Gets an unmodifiable list of teaching assistants associated with the course.
     *
     * @return The list of teaching assistants.
     */
    public List<TeachingAssistant> getTeachingAssistants()
    {
        return Collections.unmodifiableList(tas);
    }

    /**
     * Gets an unmodifiable list of students currently enrolled in the course.
     *
     * @return The list of enrolled students.
     */
    public List<Student> getEnrolledStudents()
    {
        return Collections.unmodifiableList(enrolledStudents);
    }

    /**
     * Enrolls a student in the course if there is available capacity.
     *
     * @param student
     *                The student to enroll.
     * @return {@code true} if the student is successfully enrolled, {@code false}
     *         otherwise.
     */
    public boolean enrollStudent(Student student)
    {
        if (enrolledStudents.size() < capacity)
        {
            enrolledStudents.add(student);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Unenrolls a student from the course if they are currently enrolled.
     *
     * @param student
     *                The student to unenroll.
     * @return {@code true} if the student is successfully unenrolled, {@code false}
     *         otherwise.
     */
    public boolean unenrollStudent(Student student)
    {
        if (enrolledStudents.contains(student))
        {
            enrolledStudents.remove(student);
            return true;
        }
        else
        {
            return false;
        }
    }
}
