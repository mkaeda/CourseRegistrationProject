package main.id;

public abstract class Identifier
{
    private String format;
    private String value;
    
    public Identifier(String format, String value)
    {
        if (format == null)
        {
            throw new NullPointerException("format");
        }
        
        if (value == null)
        {
            throw new NullPointerException("value");
        }
        
        if (!value.matches(format))
        {
            throw new IllegalArgumentException("identifier value must match the given format");
        }
        
        this.format = format;
        this.value  = value;
    }
    
    public String getFormat()
    {
        return this.format;      
    }
    
    public String getValue()
    {
        return this.value;      
    }
}
