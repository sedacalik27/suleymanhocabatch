package day24accessmodifiersinheritance;

public class Animal {
    /*
      inheritance ın faydalari ;
    1)code standardında tekrar iyi değildir
    2)code değişime açık olmalıdır.Htayı düzeltmek kolay olmali
    3)Gelişime update e açık olmalıdır
    4)Code atomic yapıda olmalı
    note:parent class (super class) : parent classsta  ortak özellikler bulunur.
         child class(sub class)     : class a özel özellikler içerir.
    note:Bir parent class a bağlı child class i belirtmek için "extends" keyword kullanırız.
    note:"public methodlar child classlar tarafından kullanilabilir.
         child class lar tarafindan kullanilabilir demek "inherit edilebilir" demektir.

     note: " protected " methodlar inherit edilebilir.
          çünkü protected olan method ve variablelar childlar tarafindan kullanılabilir.
     note: default methodlar object ile ayni package da oldugu sürece inherit edilebilir
         ama default method ile object in ürettiği class farklı package lerde inherit edilemez.
     note:private methodlar inherit edilemezler.
     note: java birden fazla parenti (multiple inheritance java tarafindan desteklenmez) onaylamaz
     note: child->parent-> grand parent-> grand grand parent.. şeklinde ilerleyen iheritance lara "multi level inheritance" denir
     note: java da "object class" tüm java classlarin ortak parent idir.
     note: javada object class hariç tüm class larin parenti vardir.
     note: javada parenttan childa olan ilişkilere "Has A Relationship" denir
          javada childan parente olan ilişkilere "Is A Relationship" denir.
     note:javada her classın bir tane defoult constructoru vardir
          bu defult constructor classin içinde görünmez çünkü default constructor "object class" içindedir.
           Bizim classimiz default constructora ihtiyaç duydugunda parent olan "object class" a gider ve oradaki constructor i kullanir.






     */
    public void eat(){
        System.out.println("Animal eat...");
    }

    public void drink(){
        System.out.println("Animal drink...");
    }




}
