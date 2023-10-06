package main.course;

import java.time.Month;
import java.time.MonthDay;

/**
 * Represents a semester within an academic year.
 */
public enum Semester
{
    FALL(MonthDay.of(Month.SEPTEMBER, 1), MonthDay.of(Month.DECEMBER, 31)),
    WINTER(MonthDay.of(Month.JANUARY, 1), MonthDay.of(Month.APRIL, 30)),
    SPRING(MonthDay.of(Month.MAY, 1), MonthDay.of(Month.JUNE, 30)),
    SUMMER(MonthDay.of(Month.JULY, 1), MonthDay.of(Month.AUGUST, 31));

    private MonthDay startDate;
    private MonthDay endDate;

    /**
     * Constructs a semester with the specified start and end dates.
     *
     * @param startDate
     *                  The start date of the semester.
     * @param endDate
     *                  The end date of the semester.
     */
    private Semester(MonthDay startDate, MonthDay endDate)
    {
        this.startDate = startDate;
        this.endDate   = endDate;
    }

    /**
     * Gets the start date of the semester.
     *
     * @return The start date.
     */
    public MonthDay getStartDate()
    {
        return startDate;
    }

    /**
     * Gets the end date of the semester.
     *
     * @return The end date.
     */
    public MonthDay getEndDate()
    {
        return endDate;
    }
}
