package day30exceptionsinterface;

public interface Ac {
    //Interface lerin içine "concrete" method konulmaz,cünku  "concrete" method'larda body vardir
    //ve body o methodun işi nasıl yapacagını belirtir.
    //İşin nasıl yapılacagı birçok detay içerir ve bu Child Class 'larda kafa karışıklıgına sebap olur.
    //Halbuki sadece yapılması gereken işi söyleyip nasıl yapılacagını Child'a birakırsanız
    //Child Class'ın kafa karışıklıgını engellemiş olursunuz.

    //Interface lerdeki tum methodlar otomatik olarak "public" dir,"abstract" dir,"static" degildir.
    //Interface lerdeki variabler otomatik olarak public' dir, static'tir, final'dir.
    //static demek obje oluşturmana gerek yok demek
    //Interface ler "concrete" method içermezler,dolayısıyla interface'in içindeki hiçbirşey
    // istege bağlı değildir,herşey Child Class'lar için mecburidir.buyuzden interfacelere
    //"to do list" de denir.
     //Interface lerin içindeki variable nin  degerleri değiştirilemez( final oldugu için)


    public  void cool();
    void run();

    public static final int price=2000;

    String model= "Mitsubishi";





}
