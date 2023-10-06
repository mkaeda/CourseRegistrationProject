package main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import main.course.Course;
import main.person.Student;

/**
 * Represents a registration system for managing courses and student
 * enrollments.
 */
public class RegistrationSystem
{
    private Map<String, Course> courses;

    /**
     * Constructs a new registration system.
     */
    public RegistrationSystem()
    {
        courses = new HashMap<>();
    }

    /**
     * Gets an unmodifiable map of courses in the registration system.
     *
     * @return An unmodifiable map of courses.
     */
    public Map<String, Course> getCourses()
    {
        return Collections.unmodifiableMap(courses);
    }

    /**
     * Adds a course to the registration system.
     *
     * @param course
     *               The course to add.
     */
    public void addCourse(Course course)
    {
        courses.put(course.getCode(), course);
    }

    /**
     * Registers a student for a course.
     *
     * @param courseId
     *                 The unique identifier of the course.
     * @param student
     *                 The student to register.
     * @return {@code true} if the student is successfully registered, {@code false}
     *         otherwise.
     */
    public boolean registerStudent(String courseId, Student student)
    {
        Course course = courses.get(courseId);
        if (course != null)
        {
            return course.enrollStudent(student);
        }
        else
        {
            return false;
        }
    }

    /**
     * Unregisters a student from a course.
     *
     * @param courseId
     *                 The unique identifier of the course.
     * @param student
     *                 The student to unregister.
     * @return {@code true} if the student is successfully unregistered,
     *         {@code false} otherwise.
     */
    public boolean unregisterStudent(String courseId, Student student)
    {
        Course course = courses.get(courseId);
        if (course != null)
        {
            return course.unenrollStudent(student);
        }
        else
        {
            return false;
        }
    }
}
