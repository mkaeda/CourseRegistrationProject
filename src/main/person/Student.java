package main.person;

import main.id.StudentId;

/**
 * Represents a student in an educational institution.
 */
public class Student extends Person
{
    /**
     * Constructs a new student.
     *
     * @param id
     *                  The unique identifier of the student.
     * @param firstName
     *                  The first name of the student.
     * @param lastName
     *                  The last name of the student.
     */
    public Student(StudentId id, String firstName, String lastName)
    {
        super(id, firstName, lastName);
    } 
}
