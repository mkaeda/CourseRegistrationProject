package test.course;

import org.junit.Test;

import main.course.Semester;

import java.time.Month;
import java.time.MonthDay;

import static org.junit.Assert.assertEquals;

public class SemesterTest {

    @Test
    public void testGetStartDate() {
        assertEquals(MonthDay.of(Month.SEPTEMBER, 1), Semester.FALL.getStartDate());
        assertEquals(MonthDay.of(Month.JANUARY, 1), Semester.WINTER.getStartDate());
        assertEquals(MonthDay.of(Month.MAY, 1), Semester.SPRING.getStartDate());
        assertEquals(MonthDay.of(Month.JULY, 1), Semester.SUMMER.getStartDate());
    }

    @Test
    public void testGetEndDate() {
        assertEquals(MonthDay.of(Month.DECEMBER, 31), Semester.FALL.getEndDate());
        assertEquals(MonthDay.of(Month.APRIL, 30), Semester.WINTER.getEndDate());
        assertEquals(MonthDay.of(Month.JUNE, 30), Semester.SPRING.getEndDate());
        assertEquals(MonthDay.of(Month.AUGUST, 31), Semester.SUMMER.getEndDate());
    }
}

