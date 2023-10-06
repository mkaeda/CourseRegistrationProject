package main.id;

/**
 * Represents a course code identifier in the format "Cxxx", where xxx
 * represents three digits.
 */
public class CourseCode extends Identifier
{
    private static final String format = "^C\\d{3}$";

    /**
     * Constructs a new course code identifier with the specified value.
     *
     * @param courseCode
     *                   The value of the course code identifier.
     * @throws NullPointerException
     *                                  If the provided course code is null.
     * @throws IllegalArgumentException
     *                                  If the course code does not match the
     *                                  specified format.
     */
    public CourseCode(String courseCode)
    {
        super(format, courseCode);
    }
}
