package com.example.time;

import java.text.ParseException;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang3.time.FastDateFormat;

public class FastDateFormatBasic {

  public static void main(String[] args) {
    FastDateFormat tsDatetimeFormat = FastDateFormat.getInstance("yyyy/MM/dd HH:mm:ss z", TimeZone.getTimeZone("PDT"));
    try {
      Date parsedDate = tsDatetimeFormat.parse("2021/08/15 00:00:00 UTC");
      System.out.println(tsDatetimeFormat.getTimeZone());
      System.out.println(parsedDate);
    } catch (ParseException e1) {
    }

    System.out.println(tsDatetimeFormat.format(1629012742000L));

    // FastDateFormat tsDatetimeFormat2 = FastDateFormat.getInstance("yyyy/MM/dd HH:mm:ss z");
    // System.out.println(tsDatetimeFormat.equals(tsDatetimeFormat2));
  }

}
