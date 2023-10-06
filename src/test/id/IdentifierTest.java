package test.id;

import org.junit.Test;

import main.id.Identifier;

import static org.junit.Assert.*;

public class IdentifierTest
{
    @Test
    public void testValidIdentifier()
    {
        Identifier identifier = new ConcreteIdentifier("C\\d{3}", "C123");
        assertEquals("C\\d{3}", identifier.getFormat());
        assertEquals("C123", identifier.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void testNullFormat()
    {
        new ConcreteIdentifier(null, "C123");
    }

    @Test(expected = NullPointerException.class)
    public void testNullValue()
    {
        new ConcreteIdentifier("C\\d{3}", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidValueFormatMismatch()
    {
        new ConcreteIdentifier("C\\d{3}", "D123");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidValueFormatMismatch2()
    {
        new ConcreteIdentifier("\\d{3}", "C123");
    }

    // Concrete subclass for testing purposes
    private static class ConcreteIdentifier extends Identifier
    {
        public ConcreteIdentifier(String format, String value)
        {
            super(format, value);
        }
    }
}
