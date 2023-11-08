package Chapter3Lessons;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateandTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

       LocalDate date1 = LocalDate.of(2023,12,25);
       LocalDate date2 = LocalDate.of(2023,11,25);
       LocalTime time1 = LocalTime.of(6,00);
        LocalDateTime date3 = LocalDateTime.of(2025,12,25,4,30);
       // plus & minus (days,weeks,months,years)
        System.out.println(date1.plusDays(3).minusDays(5));
        System.out.println(date1.toString());
        date1 = date1.plusDays(3).minusDays(5);
        System.out.println(date1.toString());
    // time plus & minus (hour,min,sec,nano)
        System.out.println(time1.plusHours(1));
        System.out.println(date3.plusHours(20).plusDays(4));
    //  System.out.println(date1.getDayOfWeek()+"**"+(date1.getDayOfMonth()+"**"(date1.getDayOfYear());
        System.out.println(date3.getMonth());






}}