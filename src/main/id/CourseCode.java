package main.id;

public class CourseCode extends Identifier
{
    private static final String format = "^C\\d{3}$";

    public CourseCode(String courseCode)
    {
        super(format, courseCode);       
    }
}
