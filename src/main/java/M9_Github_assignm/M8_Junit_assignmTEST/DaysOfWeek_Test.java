package M9_Github_assignm.M8_Junit_assignmTEST;

import Assignments.M8_Junit_assignm.Days_of_week;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class DaysOfWeek_Test {

    // Correct return values tests

    @Test
    public void getSundayTest() {
        int dayNumber = 1;
        String expected_daysList = "Sunday";

        Days_of_week daysOfWeek = new Days_of_week();

        String actual_daysList = daysOfWeek.getDay(dayNumber);

        assertNotNull(actual_daysList, "Null is returned.");
        assertEquals(expected_daysList, actual_daysList);
        assertTrue(actual_daysList == "Sunday");
    }

    @Test
    public void getMondayTest() {
        int dayNumber = 2;
        String expected_daysList = "Monday";

        Days_of_week daysOfWeek = new Days_of_week();

        String actual_daysList = daysOfWeek.getDay(dayNumber);

        assertNotNull(actual_daysList, "Null is returned.");
        assertEquals(expected_daysList, actual_daysList);
        assertTrue(actual_daysList == "Monday");
    }

    @Test
    public void getTuesdayTest() {
        int dayNumber = 3;
        String expected_daysList = "Tuesday";

        Days_of_week daysOfWeek = new Days_of_week();

        String actual_daysList = daysOfWeek.getDay(dayNumber);

        assertNotNull(actual_daysList, "Null is returned.");
        assertEquals(expected_daysList, actual_daysList);
        assertTrue(actual_daysList == "Tuesday");
    }

    @Test
    public void getWednesdayTest() {
        int dayNumber = 4;
        String expected_daysList = "Wednesday";

        Days_of_week daysOfWeek = new Days_of_week();

        String actual_daysList = daysOfWeek.getDay(dayNumber);

        assertNotNull(actual_daysList, "Null is returned.");
        assertEquals(expected_daysList, actual_daysList);
        assertTrue(actual_daysList == "Wednesday");
    }

    @Test
    public void getThursdayTest() {
        int dayNumber = 5;
        String expected_daysList = "Thursday";

        Days_of_week daysOfWeek = new Days_of_week();

        String actual_daysList = daysOfWeek.getDay(dayNumber);

        assertNotNull(actual_daysList, "Null is returned.");
        assertEquals(expected_daysList, actual_daysList);
        assertTrue(actual_daysList == "Thursday");
    }

    @Test
    public void getFridayTest() {
        int dayNumber = 6;
        String expected_daysList = "Friday";

        Days_of_week daysOfWeek = new Days_of_week();

        String actual_daysList = daysOfWeek.getDay(dayNumber);

        assertNotNull(actual_daysList, "Null is returned.");
        assertEquals(expected_daysList, actual_daysList);
        assertTrue(actual_daysList == "Friday");
    }

    @Test
    public void getSaturdayTest() {
        int dayNumber = 7;
        String expected_daysList = "Saturday";

        Days_of_week daysOfWeek = new Days_of_week();

        String actual_daysList = daysOfWeek.getDay(dayNumber);

        assertNotNull(actual_daysList, "Null is returned.");
        assertEquals(expected_daysList, actual_daysList);
        assertTrue(actual_daysList == "Saturday");
    }

    // Negative tests

    @Test
    public void lessThanOneTest() {
        int dayNumber = 0;
        String expected_daysList = "The number should be equal or larger than 1";
        Days_of_week daysOfWeek = new Days_of_week();

        String actual_daysList = daysOfWeek.getDay(dayNumber);

        assertNotNull(actual_daysList, "Null is returned.");
    }

    @Test
    public void moreThanSevenTest() {
        int dayNumber = 8;
        String expected_daysList = "The number should be equal or smaller than 7";
        Days_of_week daysOfWeek = new Days_of_week();

        String actual_daysList = daysOfWeek.getDay(dayNumber);

        assertNotNull(actual_daysList, "Null is returned.");

    }

    // Null value test

    @Test
    @DisplayName("Nullpointer exception expected")
    public void nullGetDayTest() {
        Days_of_week daysOfWeek = new Days_of_week();

        assertThrows(NullPointerException.class, () -> {
            daysOfWeek.getDay(null);
        });

    }

    // @Parameterized test (@MethodSource)
    Days_of_week daysOfWeek = new Days_of_week();

    static Stream<Arguments> correctValues(){
        return Stream.of(
                Arguments.of(1, "Sunday"),
                Arguments.of(2, "Monday"),
                Arguments.of(3, "Tuesday"),
                Arguments.of(4, "Wednesday"),
                Arguments.of(5, "Thursday"),
                Arguments.of(6, "Friday"),
                Arguments.of(7, "Saturday")

        );
    }
    static Stream<Arguments> incorrectValues(){
        return Stream.of(
                Arguments.of(0, "The number should be equal or larger than 1"),
                Arguments.of(8, "The number should be equal or smaller than 7")
        );
    }
    @ParameterizedTest
    @MethodSource("correctValues")
    public void correctValuesGetDayTest(int dayNumber, String expected_daysList) {
        String actual_daysList = daysOfWeek.getDay(dayNumber);

        assertEquals(expected_daysList, actual_daysList);
    }
    @ParameterizedTest
    @MethodSource("incorrectValues")
    public void incorrectValuesGetDayTest(Integer dayNumber, String messageToReturn) {
    String messageReturned = daysOfWeek.getDay(dayNumber);
        assertEquals(messageToReturn, messageReturned);
    }

}








