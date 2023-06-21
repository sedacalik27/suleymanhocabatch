package day28exceptions;

import java.sql.SQLOutput;

public class Exceptions02 {
    public static void main(String[] args) {
        String s="1234";

        convertStringToInt(s);

        String t="1a2b";
        convertStringToInt(t);

    }
    //içinde rakamlar dışında character olan bir String i sayıya cevirmek isterseniz Java "NumberFormatException" atar.

    public static void convertStringToInt(String s){
        int intS=0;

       try{
        intS= Integer.valueOf(s);
       }catch(NumberFormatException e){
           System.out.println("Bir Stringin sayıya dönüştürülebilmesi için rakam dısı character içermememsi gerekir ");
           System.out.println(e.getMessage());
       }

        System.out.println(intS+1);



    }
}
