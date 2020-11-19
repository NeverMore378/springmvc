package pers.xzj.springmvc.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dataconverter implements Converter<String,Date> {
    @Override
    public Date convert(String s) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
//    public static void main(String[] args) {
//        try {
//            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2020-05-18 09:56:18"));
//            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }





}
