package myr.vsem.module4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class LogsService
 * @since 10.04.2021 - 19.50
 */
public class LogsService {
    private String file;

    public LogsService() {
    }

    public LogsService(String file) {

        this.file = file;
    }

    public String getFile() {

        return file;
    }

    public void setFile(String file) {

        this.file = file;
    }

    public static void getLogsByDateToFile(String file, LocalDate date) throws IOException  {

        String dateAsString = date.toString();

        String str = "";

        StringBuilder sb = new StringBuilder(str);

        Files.lines(Paths.get(file))

                .filter(log -> log.contains(dateAsString))

                .filter(log -> log.contains("ERROR"))

                .forEach(log -> sb.append(log + '\n'));

        String fileOutput = "C:/Users/User/Downloads/" + "ERROR" + dateAsString + ".logs.txt";

        Files.write(Paths.get(fileOutput), sb.toString().getBytes(StandardCharsets.UTF_8));

    }
}

