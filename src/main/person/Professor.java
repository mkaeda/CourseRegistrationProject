package main.person;

/**
 * Represents a professor in an educational institution.
 */
public class Professor
{
    private String id;
    private String firstName;
    private String lastName;

    /**
     * Constructs a new professor.
     *
     * @param id
     *                  The unique identifier of the professor.
     * @param firstName
     *                  The first name of the professor.
     * @param lastName
     *                  The last name of the professor.
     */
    public Professor(String id, String firstName, String lastName)
    {
        this.id        = id;
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    /**
     * Gets the unique identifier of the professor.
     *
     * @return The professor's identifier.
     */
    public String getId()
    {
        return this.id;
    }

    /**
     * Gets the first name of the professor.
     *
     * @return The professor's first name.
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Gets the last name of the professor.
     *
     * @return The professor's last name.
     */
    public String getLastName()
    {
        return this.lastName;
    }
}
