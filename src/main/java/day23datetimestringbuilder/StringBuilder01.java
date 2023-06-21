package day23datetimestringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        Javada String ,"String Class" kullanılarak veya "StringBuilder Class" kullanılarak oluşturulabilir
        "String Class" kullanılarak urettiğiniz string ler "ımmutuble (değiştirilemez)" dir.
         "StringBuilder Class" kullanılarak uretttiğiniz Stringler "Mutable (değiştirilebilir) " dir.

         */
        //ımmutable
        String s= "Java";
        String t= s+ "!";
        String w= t+ "?";

        //String i değiştirdikten sonra ayni String e assign ederseniz,Java yine yeni bir container oluşturur
        //değişmiş degeri bu yeni container in içine koyar ve eski container i gösteren oku yeni container a yonlendirir
        //dolayısı ile eski container adressiz kalır ve "Garbage collector" adresssiz olan container lari siler.

        String a= "Money";
        a= a+ "More";


        //mutable
        //StringBuilder kullanarak String uretmenin 1. yolu:
        StringBuilder sb1= new StringBuilder("Python");
        System.out.println(sb1);//Python

        sb1.append("!").append("?").append(".");//her appent orjinal değeri yok eder
        System.out.println(sb1);//Python!?.


        //StringBuilder kullanarak String uretmenin 2. yolu:

        StringBuilder sb2=new StringBuilder();
        System.out.println(sb2.length());//0

        sb2.append("Java");
        System.out.println(sb2.length());//4
        //StringBuilder kullandıgınızda başlangıc capacitesi 16 dir
        //kapasite aşıldıgında varolan kapasitenin ik fazlası kadar varolan kapasiteye ekleme yapılır
        //16==>16*2+2     34==>34*2+2
        System.out.println(sb2.capacity());//16
        sb2.append("XXXXXXXXXXXXXXX");

        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34= 16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70=34*2+2


        //StringBuilder kullanarak String uretmenin 3. yolu:
        StringBuilder sb3= new StringBuilder(2);

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"xxxxxx");//bu method ilk 2 karakteri es geç ve x leri oraya yerleştir demek
        System.out.println(sb3);//Flxxxxxxo
        System.out.println(sb3.length());//9

        //toString() methodu StringBuilder i Stringe çevirir.
        //String classta var olan ama StringBuilder class ta var olmayan split() method gibi
        //methodlara ihtiyaç duydugumuzda toString() methodunu kullanarak String class gecer ve o methodlari kullanırız
        sb3.toString().split("l");

        //String i tekrar StringBuildera çevirebilirsiniz
        StringBuilder sb4=new StringBuilder(sb3);

        //reverse() methodu String leri ter çevirir.
        sb3.reverse();
        System.out.println(sb3);//oxxxxxxlF

        sb3.deleteCharAt(1);//index 1 deki characteri sil demek
        System.out.println(sb3);//oxxxxxlF


        //delete(1,6); index 1 deki characterden index5(6 dahil olmadıgı için 5 yazdım) deki
        //charactere kadar tüm characterleri sil.
        sb3.delete(1,6);
        System.out.println(sb3);//olF

        StringBuilder sb5= new StringBuilder("Kava");
        StringBuilder sb6= new StringBuilder("Java");

        //sb5.compareTo(sb6) methodu sb5 ile sb6 yi alphabetic siralama olarak karşılartırır.
        //sb5 alphabetic sıralamada once ise sonuc negatif olur. sonra ise pozitif olur.
        System.out.println(sb5.compareTo(sb6));//1


        //setCharAt(2,'m');index 2 deki caharacteri m ye çevirir.
        sb6.setCharAt(2, 'm');;
        System.out.println(sb6);//Jama

        sb6.replace(1,3,"xyz");
        System.out.println(sb6);//Jxyza

        //StringBuilder class da kullanmamıza izin verilen substring() method gibi bazı String class methodları vardır,
        //bu methodlari StringBuilder ustunde kullanınca StringBuilder in degeri değişmez.
        String s7=sb6.substring(1,3);
        System.out.println(s7);//xy
        System.out.println(sb6);//Jxyza










    }
}
