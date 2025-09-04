package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = date.getDayOfWeek(); // DayOfWeek 은 요일을 나타내는 열거형이다.
        DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        // TemporalAdjusters 는 날짜와 시간을 조작할 수 있는 클래스다. with와 같이 쓴다.

        System.out.println("firstDayOfWeek = "+firstDayOfWeek);
        System.out.println("lastDayOfWeek = "+lastDayOfWeek);

    }
}
