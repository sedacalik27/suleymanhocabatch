package day28exceptions;

public class Exceptions06 {
    public static void main(String[] args) {

        String s="Java";
        getNumberOfChars(s);//4

        String t="";
        getNumberOfChars(t);//0

        String u=null;
        getNumberOfChars(u);


    }
    //String in degeri null oldugunda String Class'daki bazi methodlari kullanamyız.
    //Kullanırsaniz java NullPointerException atar

    public static void getNumberOfChars(String s){

        try{
            int numOfChars=s.length();
            System.out.println(numOfChars);

        }catch (NullPointerException e){
            System.out.println("null degeri için bazi methodlar kullanılamaz");
        }

    }

}
