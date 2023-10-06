package main.id;

public class PersonId
{
    private String value;

    public PersonId(String idNumber)
    {
        if (idNumber == null)
        {
            throw new NullPointerException("idNumber");
        }
        
        if (!idNumber.matches("^\\d{3}$"))
        {
            throw new IllegalArgumentException("idNumber must be a three-digit numeric value");
        }
        this.value = "P".concat(idNumber);
    }

    public String getValue()
    {
        return this.value;
    }
}
