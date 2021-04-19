package myr.vsem.module4;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class MyThread
 * @since 15.04.2021 - 11.27
 */
public class MyThread extends Thread{
    private LocalDate data;


    public MyThread(LocalDate data) {
        this.data = data;

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public void run() {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(this.getName() + " has been started at " + start);
        try {
            LogsService.getLogsByDateToFile("C:/Users/User/Downloads/logs.txt",this.getData());
        } catch (IOException e) {
            e.printStackTrace();
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println(this.getName() + " has been finished at " + finish);
        System.out.println(this.getName() + " Duration is " +
                ChronoUnit.MILLIS.between(start,finish));

    }
}