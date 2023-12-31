package main.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.id.CourseCode;
import main.person.Student;

/**
 * Represents a course offered within an educational institution.
 */
public class Course
{
    private CourseCode    code;
    private String        name;
    private int           capacity;
    private List<Student> enrolledStudents;

    /**
     * Constructs a new course.
     *
     * @param code
     *                 The course code or identifier.
     * @param name
     *                 The name or title of the course.
     * @param capacity
     *                 The maximum number of students that can enroll in the course.
     */
    public Course(CourseCode code, String name, int capacity)
    {
        this.code             = code;
        this.name             = name;
        this.capacity         = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    /**
     * Gets the course code.
     *
     * @return The course code.
     */
    public CourseCode getCode()
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
