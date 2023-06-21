package day28exceptions;

import java.sql.SQLOutput;

public class Exceptions01 {
    /*
    1)Excaption demek beklenmedik problem demek.seyehatte benzin bitmesi arabanın bozulması gibi
    2)Gercek hayatta karşılaştıgımız beklenmedik problemler için çözüm yollarımız vardır
       mesela benzin bitince yol yardımı ararız.Applicationlardada beklenmedik problemler için
       cözüm yolları uretmeliyiz, bu işleme "exception Handling" denir.
    3)Exceptionlar temel olarak ikiye ayrılır;
        i)Compile time Exception:Siz code yazarken farkedilir ve yazdıgınız kodun alti kırmızı çizilir.
       ii)Run Time Exception:Siz cade yazarken farkedilmez ama code u çalıştırdıgınızda consolda hata alırsın
   4) Exceptionlar dışında "error" diye adlandırdıgımız "handle" edilemeyen problemler vardır.
      gercek hayatta söforun olmesi gibi.handle edilemeyecek durumlar "error" dur
      Application larda "Memory" nin dolması "error dur.
      iki tur memory vardir;
          1)Stack Memory dolarsa "StackOverFlow Error" alırsınız
          2)Heap Memory dolarsa "OutOfMemory Error" alırsınız


    5) Yazdıgınız code çalışmadıgında problemi anlamak için "log(consolda yazan yazılar)" lara bakarız.
    6)if else kullanırsak olusabilecek her problemi spesifik olarak if parantezinin içine yazmamız gerekir
       buda ciddi bir matematik bilgisi gerektirir ve yazacagınız kodu çok uzatır.
       ama try catch te Java ilgili Exception ile alakalı oluşabilecek   butun problemleri yakalar


     */

    public static void main(String[] args) {

        int a=12;
        int b=0;


        divide(a,b);


        divide2(a,b);

    }

    //ArithmeticException yazdıgınız code da matematiksel işlem kullanıyorsanız alınabilecek bir Exception dir.
    //Nasıl handle edilecegini asagıda yazdık
    public static void divide(int a, int b){
        try{
        System.out.println(a/b);

            System.out.println("ı am here");

        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero(sıfırla bölme yapma)");

        }

        System.out.println("you are here");
    }

    //Exception handlin de if else kullanılmaz. bakın 6.note

    public static void divide2(int a, int b){
        if(b==0){
            System.out.println("Do not divide by zero");
        }else{
            System.out.println(a/b);
        }
    }


}
