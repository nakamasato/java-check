package com.example.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.FastDateFormat;

/**
 * Hello world!
 *
 */
public class FastDateFormatCheck {

    public static void main(String[] args) {
        FastDateFormat fastDateFormat = FastDateFormat.getInstance("yyyy/MM/dd HH:mm:ss z");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss z");

        String[] timeStamps = new String[] {
                "2021/07/10 00:00:00 UTC",
                "2021/07/10 00:00:00 PDT",
        };
        for (String timeStamp : timeStamps) {
            try {
                Date fastDate = fastDateFormat.parse(timeStamp);
                Date normalDate = dateFormat.parse(timeStamp);
                System.out.println("[FastDateFormat]\tsource: " + timeStamp + "\tparsed: " + fastDate + "\tgetTimeZone: " + fastDateFormat.getTimeZone().getID());
                System.out.println("[SimpleDateFormat]\tsource: " + timeStamp + "\tparsed: " + normalDate + "\tgetTimeZone: " + dateFormat.getTimeZone().getID());
            } catch (ParseException e1) {
            }
            System.out.println("------------------------------------");
        }
    }
}
