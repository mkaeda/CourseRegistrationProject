package main.person;

/**
 * Represents a teaching assistant in an educational institution.
 */
public class TeachingAssistant
{
    private String id;
    private String firstName;
    private String lastName;

    /**
     * Constructs a new teaching assistant.
     *
     * @param id
     *                  The unique identifier of the teaching assistant.
     * @param firstName
     *                  The first name of the teaching assistant.
     * @param lastName
     *                  The last name of the teaching assistant.
     */
    public TeachingAssistant(String id, String firstName, String lastName)
    {
        this.id        = id;
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    /**
     * Gets the unique identifier of the teaching assistant.
     *
     * @return The teaching assistant's identifier.
     */
    public String getId()
    {
        return this.id;
    }

    /**
     * Gets the first name of the teaching assistant.
     *
     * @return The teaching assistant's first name.
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Gets the last name of the teaching assistant.
     *
     * @return The teaching assistant's last name.
     */
    public String getLastName()
    {
        return this.lastName;
    }
}
