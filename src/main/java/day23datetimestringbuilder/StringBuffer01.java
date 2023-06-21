package day23datetimestringbuilder;

public class StringBuffer01 {
    public static void main(String[] args) {
        /*
        String oluşturmak için String class StringBuilder ve StringBuffer kullanılabilir
        1)StringBuffer Javanın String uretmek için oluşturdugu ilk calassdır.java 5 üretmiştir
        2)StringBuffer "synchronized" dir,StringBuilder "synchronized" degildir.
        3)StringBuffer "thread-safe(multi-thread e uygun)" dir, StringBuilder "thread-safe" değildir
        4)StringBuffer ve StringBuilder ikiside mutable dir.

        note1;Immutable String lazım oldugunda String class kullanırız
        note2: Mutable String lazım oldugunda StringBuilder veya StringBuffer kullanırız
        note3:StringBuffer "Multithread" ve "Synchronization" lazım oldugunda tercih edilir
              StringBuilder "Multithread" ve "Synchronization" gerekmezse tercih edilir.


         */

        StringBuffer sbf=new StringBuffer("Java");
        System.out.println(sbf);//Java
        System.out.println(sbf.capacity());//20


    }
}
