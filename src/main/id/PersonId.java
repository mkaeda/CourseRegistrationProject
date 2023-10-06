package main.id;

public class PersonId extends Identifier
{
    private static final String format = "^P\\d{3}$";

    public PersonId(String idNumber)
    {
        super(format, idNumber);       
    }
}
