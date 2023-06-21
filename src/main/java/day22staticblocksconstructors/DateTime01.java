package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class DateTime01 {

    public static void main(String[] args) {



    //Date class
        Date myDate= new Date();
        System.out.println(myDate);//Sun Jun 18 00:39:26 EET 2023

        System.out.println(myDate.getTime());//1687038014840==> 1 ocak 1970 den suana kadar ki mili saniye miktari

        //içinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now());//2023-06-18

        System.out.println(LocalTime.now());//00:43:26.105510200




    }


}
