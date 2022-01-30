package w3resource_31_60;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex47 {
    public static void main(String[] args) {
        SimpleDateFormat cdt=new SimpleDateFormat("yyyy/mm/dd/hh:mm:hh.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMS")));
        System.out.println("Now:"+cdt.format(System.currentTimeMillis()));
    }
}
