package main.id;

/**
 * An abstract class representing an identifier with a specific format.
 */
public abstract class Identifier
{
    private String format;
    private String value;

    /**
     * Constructs a new identifier with the specified format and value.
     *
     * @param format
     *               The regular expression format that the value must match.
     * @param value
     *               The value of the identifier.
     * @throws NullPointerException
     *                                  If the provided format or value is null.
     * @throws IllegalArgumentException
     *                                  If the value does not match the specified
     *                                  format.
     */
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

    /**
     * Gets the format of the identifier.
     *
     * @return The regular expression format.
     */
    public String getFormat()
    {
        return this.format;
    }

    /**
     * Gets the value of the identifier.
     *
     * @return The identifier value.
     */
    public String getValue()
    {
        return this.value;
    }
}
