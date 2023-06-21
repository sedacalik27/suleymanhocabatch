package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //example 1:Time i formatlayiniz
        LocalTime myTime= LocalTime.now();
        System.out.println(myTime);//22:34:41.744620500

        //hh==> 12 lik saat sistemini kullanir  HH==>24 luk saat sistemini kullanır
        //hh kullandıgımızda AM veya PM demelisiniz bunu demek için "a" yazmaniz yeterlidir.
        //yani ;" hh:mm a"

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(dtf.format(myTime));//10:48:22 PM

    }
}
