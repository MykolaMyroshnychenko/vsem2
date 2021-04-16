package myr.vsem.module4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class Results4
 * @since 14.04.2021 - 17.07
 */
public class Results4 {

    public static void main(String[] args) throws IOException {

        LocalDateTime start = LocalDateTime.now();

        LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 5);

        for (int i = 0; i < 5 ; i++) {

            LogsService.getLogsByDateToFile("C:/Users/User/Downloads/logs.txt", date.plusDays(i));
        }

        LocalDateTime finish = LocalDateTime.now();

        System.out.println(ChronoUnit.MILLIS.between(start, finish));

        System.out.println("---------------------------------");

        start = LocalDateTime.now();
        for (int i = 0; i < 5 ; i++) {
            new MyThread(date.plusDays(i)).start();
        }
    }
}
