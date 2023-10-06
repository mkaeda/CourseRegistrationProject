package main.id;

public class StudentId extends Identifier
{
    private static final String format = "^S\\d{3}$";

    public StudentId(String studentId)
    {
        super(format, studentId);       
    }
}
