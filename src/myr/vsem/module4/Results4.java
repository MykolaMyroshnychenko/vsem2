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

        System.out.println(ChronoUnit.MILLIS.between(start, finish) + " - MILLIS");

        System.out.println("----------------------------------------------------");

        start = LocalDateTime.now();
        for (int i = 0; i < 5 ; i++) {
            new MyThread(date.plusDays(i)).start();
        }
    }
}
/*
Result:
3928 - MILLIS
----------------------------------------------------
Thread-0 has been started at 2021-04-16T16:52:01.038
Thread-1 has been started at 2021-04-16T16:52:01.038
Thread-2 has been started at 2021-04-16T16:52:01.039
Thread-3 has been started at 2021-04-16T16:52:01.040
Thread-4 has been started at 2021-04-16T16:52:01.041
Thread-0 has been finished at 2021-04-16T16:52:01.992
Thread-0 Duration is 954
Thread-2 has been finished at 2021-04-16T16:52:02.016
Thread-2 Duration is 977
Thread-4 has been finished at 2021-04-16T16:52:02.033
Thread-3 has been finished at 2021-04-16T16:52:02.033
Thread-4 Duration is 992
Thread-3 Duration is 993
Thread-1 has been finished at 2021-04-16T16:52:02.042
Thread-1 Duration is 1004

Conclusion:
On average, each thread is 984 milliseconds.
The difference between the first and the last thread is 0.050 milliseconds.
Comparing the two methods, the fastest is multi-thread,
 using it we significantly save time for information processing.
 */