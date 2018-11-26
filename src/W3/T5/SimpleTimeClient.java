package W3.T5;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Exercise 3 Task 5
 * Link: https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/08/2018
 *
 * Method : Ad-Hoc
 * Status : ???
 * Runtime: ???
 */


import java.time.*;
import java.lang.*;
import java.util.*;

public class SimpleTimeClient implements TimeClient {

    private LocalDateTime dateAndTime;

    public SimpleTimeClient() {
        dateAndTime = LocalDateTime.now();
    }

    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }

    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }

    public void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }

    public String toString() {
        return dateAndTime.toString();
    }

    public Object clone() {
        SimpleTimeClient stp = new SimpleTimeClient();
        stp.setDateAndTime(getLocalDateTime());
        return stp;
    }

    public static void main(String... args) {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println(myTimeClient.toString());

        TimeClient myTimeClient2 = new SimpleTimeClient();
        System.out.println((myTimeClient2.toString()));

        Object tmp = myTimeClient2.clone();
        if (!myTimeClient2.equals(tmp)) {
            System.out.println("\nmyTimeClient2 and tmp are pointing to different Objects");
        }
        if (tmp instanceof TimeClient) {
            System.out.println("\ntmp is a TimeClient");
            myTimeClient2 = (TimeClient) tmp;
        }
        Class t0 = myTimeClient2.getClass();
        System.out.println("\nClass object of myTimeClient2: " + t0.toString());

        int hash = myTimeClient2.hashCode();
        System.out.println("\nHash of myTimeClient: " + hash);

        System.out.println("\nString of myTimeClient: " + myTimeClient2.toString());
    }
}