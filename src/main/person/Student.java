package main.person;

/**
 * Represents a student in an educational institution.
 */
public class Student
{
    private String id;
    private String firstName;
    private String lastName;

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
    public Student(String id, String firstName, String lastName)
    {
        this.id        = id;
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    /**
     * Gets the unique identifier of the student.
     *
     * @return The student's identifier.
     */
    public String getId()
    {
        return this.id;
    }

    /**
     * Gets the first name of the student.
     *
     * @return The student's first name.
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Gets the last name of the student.
     *
     * @return The student's last name.
     */
    public String getLastName()
    {
        return this.lastName;
    }
}
