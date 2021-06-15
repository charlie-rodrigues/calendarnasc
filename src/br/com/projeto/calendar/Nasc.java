package br.com.projeto.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Charlie
 */
public class Nasc {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdfToday = new SimpleDateFormat("dd/MM/yyyy");
        sdfToday.setTimeZone(TimeZone.getTimeZone("GMT"));
        SimpleDateFormat sdfBirth = new SimpleDateFormat("dd/MM/yyyy");
        sdfBirth.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date birth = sdfBirth.parse("12/08/1985");
        Date today = new Date();
        System.out.println("today: " + sdfToday.format(today));
        System.out.println("birth: "+sdfBirth.format(birth));
        String nasc = "12/08/1985";
       
       
    }
    
}
