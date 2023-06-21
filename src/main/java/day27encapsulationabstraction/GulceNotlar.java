package day27encapsulationabstraction;

public class GulceNotlar {
    //       abstract
/*
    1)Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
  Body'si olmayan method'lara "abstract method" lar denir.

2)"abstract method" lar child class'lar tarafindan "override" edilmek zorundadirlar.
  Bu yuzden, eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseniz
  o method'u abstract yapmak gerekir.

3)Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
  "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

4)"abstract method" lar siradan class'larin(concrete) icine yazilamazlar, "abstract method" larin icine yazildiklari class'lar da
  abstract olmak zorundadirlar.

5)"abstract class" larda hem "abstract method" lar hem de "concrete method" lar kullanilabilir.

6)"concrete class" lar "abstract class" larin child'i olabilirler.
  "abstract method" larin override edilme zorunlulugu "concrete class" lar icindir.

 */
//final method'lar "override" edilemezler, halbuki "abstract" method'lar override edilmek icin olusturulurlar.
//Bu celiskidir bu yuzden Java abstract method'larin final olmasina musaade etmez.
//public final abstract void science();

// Concrete Class'lar final oldugunda Child Class'a sahip olamazlar
// Ama "Abstract Class" lar icin Child Class olmalidir,cunku Child Class'lar abstract parent classs'daki abstract method'lari kullanirlar.
// Bu yuzden Java "Abstract Class"larin "final " olmasina musaade etmez.

//Abstract method lar private olamazlar, cunku child class lar abstract metodlari kullanirlar, private yapinca kullanima kapali olur bu
// celiskidir.Bu yuzden Java abstract medhodlarin private olmasina musaade etmez


    //"abstract class"larin icinde "abstract method"lar vardir.
    //"abstract method"larin body'si olmadigindan bu method'lar yarim method sayilir.
    //Dolayisiyla; abstract class'lar eksigi olan kaliplar gibi dusunulebilir.
    //Java eksik kaliplarin object uretmesine musaade etmez.
    //Bu yuzden, abstract class'lardan object uretilemez.
    // abstract class larin constructer i vardir ama obje uretemezler
}
