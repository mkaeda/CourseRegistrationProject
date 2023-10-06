package main.person;

import main.id.Identifier;

/**
 * Represents a person in an educational institution.
 */
public abstract class Person
{
    private Identifier id;
    private String     firstName;
    private String     lastName;

    /**
     * Constructs a new person.
     *
     * @param id
     *                  The unique identifier of the person.
     * @param firstName
     *                  The first name of the person.
     * @param lastName
     *                  The last name of the person.
     */
    public Person(Identifier id, String firstName, String lastName)
    {
        this.id        = id;
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    /**
     * Gets the unique identifier of the person.
     *
     * @return The identifier.
     */
    public Identifier getId()
    {
        return this.id;
    }

    /**
     * Gets the first name of the person.
     *
     * @return The first name.
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Gets the last name of the person.
     *
     * @return The last name.
     */
    public String getLastName()
    {
        return this.lastName;
    }
}
