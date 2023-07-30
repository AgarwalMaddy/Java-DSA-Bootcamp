import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class Diff_Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String startDate = sc.next();
        String endDate = sc.next();

        LocalDate sDate = LocalDate.parse(startDate);
        LocalDate eDate = LocalDate.parse(endDate);

        long days = ChronoUnit.DAYS.between(sDate , eDate);
        System.out.println(days);

        // Replace these dates with your desired start and end dates
        String startDateString = "2019-01-15";
        String endDateString = "2024-08-05";

        // Parse the dates
//        LocalDate startDate = LocalDate.parse(startDateString);
//        LocalDate endDate = LocalDate.parse(endDateString);

        // Calculate the difference in days between the two dates
//        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

//        System.out.println("Number of days between the two dates: " + daysBetween);
    }
}
