package ru.eds2809.dnevnik.utils;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    private static final DateFormatSymbols myDateFormatSymbols = new DateFormatSymbols() {

        @Override
        public String[] getMonths() {
            return new String[]{"января", "февраля", "марта", "апреля", "мая", "июня",
                    "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        }

    };

    private Utils() {

    }

    public static String convertDate(Date currentDate) {
        return new SimpleDateFormat("dd MMMM").format(currentDate);
    }
}
