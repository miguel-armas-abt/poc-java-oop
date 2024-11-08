package com.demo.poc.encapsulation.dates.service;

import com.demo.poc.encapsulation.dates.models.Date;
import com.demo.poc.encapsulation.dates.models.Day;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateFormatterService {

  private static final String DATE_PATTERN = "yyyyMMdd";
  private static final String LANGUAGE_ES = "es";

  public Date mapDate(String stringDate) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
    LocalDate localDate = LocalDate.parse(stringDate, formatter);

    Date date = new Date();

    Day day = new Day();
    day.setName(retrieveDayName(localDate));
    day.setNumber(localDate.getDayOfMonth());

    date.setDay(day);
    date.setMonth(retrieveMonthName(localDate));
    date.setYear(localDate.getYear());

    return date;
  }

  private String retrieveDayName(LocalDate localDate) {
    String dayName = localDate
        .getDayOfWeek()
        .getDisplayName(TextStyle.SHORT, new Locale(LANGUAGE_ES));

    return dayName.substring(0,1).toUpperCase() + dayName.substring(1);
  }

  private String retrieveMonthName(LocalDate localDate) {
    String monthName = localDate
        .getMonth()
        .getDisplayName(TextStyle.FULL, new Locale(LANGUAGE_ES));

    return monthName.substring(0,1).toUpperCase() + monthName.substring(1);
  }
}


