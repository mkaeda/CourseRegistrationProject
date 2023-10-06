package main.person;

import main.id.Identifier;

public abstract class Person
{
    private Identifier id;
    private String firstName;
    private String lastName;

    public Person(Identifier id, String firstName, String lastName)
    {
        this.id        = id;
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    public Identifier getId()
    {
        return this.id;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }
}
