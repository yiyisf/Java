package com.sandra.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import static java.time.ZoneId.SHORT_IDS;

public class DateDemo {
    public static void main(String[] args) {
        //本地日期
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.plusDays(10).toString());
        //本地时间
        LocalTime localTime = LocalTime.now();
        localTime = LocalTime.of(15, 59);
        System.out.println(localTime.toString());
        System.out.println(localTime.getHour());
        System.out.println(localTime.atDate(localDate).toString());
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);


        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        Duration duration = Duration.ofMillis(5000);
        System.out.println(duration.toString());
        duration = Duration.ofMinutes(1);
        System.out.println(duration.toString());
        duration = Duration.between(Instant.now(), Instant.now());
        System.out.println(duration);

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);
        System.out.println(clock.instant().toEpochMilli());
        System.out.println(clock.getZone());

        Clock anotherClock = Clock.system(ZoneId.of(SHORT_IDS.get("ECT")));
        System.out.println(anotherClock);
        System.out.println(anotherClock.instant().toString());


        DateTimeFormatterBuilder formatterBuilder = new DateTimeFormatterBuilder();
        formatterBuilder.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).appendLiteral("-").appendZoneOrOffsetId();

        DateTimeFormatter formatter = formatterBuilder.toFormatter();

        System.out.println(formatter.format(ZonedDateTime.now()));
    }
}
