import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        // Starting time:
        System.out.print("Enter to start stopwatch.");
        String start = input.nextLine();
        LocalDateTime currentTime = LocalDateTime.now();
        String currentTimeS = currentTime.format(formatter);
        System.out.println( "Stopwatch started @ " + currentTimeS );

        // Ending time:
        System.out.print("Enter to stop stopwatch.");
        String end = input.nextLine();
        LocalDateTime currentTime2 = LocalDateTime.now();
        String currentTime2S = currentTime2.format(formatter);
        System.out.println( "Stopwatch stopped @ " + currentTime2S );

        // Calculating ms difference:
        Duration diff = Duration.between(currentTime, currentTime2);
        long secDiff = diff.getSeconds();
        System.out.println( secDiff + (secDiff > 1 ? " SECONDS PASSED BY." : " SECOND PASSED BY."));
    }


}