package main.id;

public class CourseCode
{
    private String value;
    
    public CourseCode(String courseNumber)
    {
        if (courseNumber == null)
        {
            throw new NullPointerException("courseNumber");
        }
        
        if (!courseNumber.matches("^\\d{3}$"))
        {
            throw new IllegalArgumentException("courseNumber must be a three-digit numeric value");
        }
        this.value = "C".concat(courseNumber);
    }
    
    public String getValue()
    {
        return this.value;
    }
}
