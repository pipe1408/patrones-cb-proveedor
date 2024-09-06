package com.felipe.patronescbproveedor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ISOTimeGenerator {
    public static String getTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        return now.format(formatter);
    }
}
