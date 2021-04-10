package myr.vsem.module4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class Module4
 * @since 09.04.2021 - 19.49
 */
public class Module4 {
    public static void main(String[] args) throws IOException {

        LocalDateTime start = LocalDateTime.now();

        // Adding a txt file

        String logs = new String(Files.readAllBytes(Paths.get("C:/Users/User/Downloads/logs.txt")));

        // The total number of logs

        final String[] lines = logs.split("\n");

        System.out.println("The total number of logs - " + lines.length);

        // The total number of ERROR logs. Use previous skills - String.split

        int counter = 0;

        for (int i = 0; i < lines.length; i++) {

            if (lines[i].contains("ERROR")) counter++;

        }

            System.out.println("Way 1: ERRORS - " + counter);

        LocalDateTime finish = LocalDateTime.now();

        System.out.println("Time of processing - " + ChronoUnit.MILLIS.between(start, finish));

        // The total number of ERROR logs. Use Files.lines. Way 2

        start = LocalDateTime.now();

        System.out.println ("Way 2: ERRORS - " + Files.lines(Paths.get("C:/Users/User/Downloads/logs.txt"))
                .filter(line -> line.contains("ERROR")).count());

        finish = LocalDateTime.now();

        System.out.println("Time of processing - " + ChronoUnit.MILLIS.between(start, finish));

        // The total number of ERROR logs. Use Files.lines. Way 3

        start = LocalDateTime.now();

        final List<String> linesList = Files.readAllLines(Paths.get("C:/Users/User/Downloads/logs.txt"));

        System.out.println("Way 3: ERRORS - " + linesList.stream().filter(line -> line.contains("ERROR")).count());

        finish = LocalDateTime.now();

        System.out.println("Time of processing - " + ChronoUnit.MILLIS.between(start, finish));
    }
}

/*
Result:
The total number of logs - 2845607
Way 1: ERRORS - 361
Time of processing - 3505
Way 2: ERRORS - 361
Time of processing - 1913
Way 3: ERRORS - 361
Time of processing - 2074

Conclusion:

 */
