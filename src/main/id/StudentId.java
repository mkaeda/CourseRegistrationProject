package main.id;

/**
 * Represents a unique identifier for a student.
 */
public class StudentId extends Identifier
{
    private static final String format = "^S\\d{3}$";

    /**
     * Constructs a new student identifier.
     *
     * @param studentId
     *                  The unique identifier for the student.
     * @throws NullPointerException
     *                                  If the provided student identifier is null.
     * @throws IllegalArgumentException
     *                                  If the student identifier does not match the
     *                                  expected format.
     */
    public StudentId(String studentId)
    {
        super(format, studentId);
    }
}
