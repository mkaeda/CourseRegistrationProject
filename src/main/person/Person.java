package main.person;

import main.id.PersonId;

public abstract class Person
{
    private PersonId id;
    private String firstName;
    private String lastName;

    public Person(PersonId id, String firstName, String lastName)
    {
        this.id        = id;
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    public PersonId getId()
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
