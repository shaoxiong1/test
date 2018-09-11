package com.itheima.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String DateToString(String str, Date date) {
        DateFormat format = new SimpleDateFormat(str);
        String s = format.format(date);
        return s;
    }

    public static Date StringToDate(String str, String date) throws ParseException {
        DateFormat format=new SimpleDateFormat(str);
        Date parse = format.parse(date);
        return parse;
    }
}
