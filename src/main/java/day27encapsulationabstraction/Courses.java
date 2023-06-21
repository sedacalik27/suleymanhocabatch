package day27encapsulationabstraction;

public abstract class Courses {
    /*
    1)bazen method bodysini yazmak gerekmez bu durumlarda body siz method oluşturmak gerekir
      body si olmayan methodlara "abstract method" lar denir
    2) "abstract method " lar  child class lar tarafından "override" edilmek zorundadırlar.
         Buyüzden, eger bir fonsksiyonun child class lar tarafından kullanılmasını mecbur kılmak isterseniz
        o methodu abstract yapmak gerekir.
     3)bir methodun body sini silmek o methodun abstract olması için yeterli değildir
       "access modifier" ile " return type" arasına "abstract" keywordu koymak gerekir.

     4)"abstract method " lar sıradan classların(concrete) içine yazılamazlar,"abstract method " ların içine yazıldıkları
        class larda abstract olmak zorundadırlar.


     5) "abstract class" larda hem "abstract method " lar hemde "concrete method" lar kullanılabilir.

     6) "concrete class" lar " abstract class" ların child i olabilirler.
        "abstract method " ların override edilme zorunlulugu "concrete class" lar içindir


     */

    public abstract void math();

    public void art(){
        System.out.println("Painting...");
    }
    //final methodlar "override" edilemezler,halbuki "abstract" methodlar override edilmek için oluşturulurlar
    //Bu çelişkidir,bu yuzden Java abstract methodların final olmasına musaade etmez.
    //public final abstract void science();

    //Concrete Class lar final oldugunda Child Class asahip olamazlar
    //Ama "abstract class" lar için child class olmalıdır,cunku Child Class lar abstract parent
    //class daki abstract methodlari kullanırlar.
    //Bu yuzden java "abstract class" larin "final " olmasına musaade etmez.

    //Abstract methodlar private olamazlar çünkü child class lar abstract methodları kullanırlar,
    //private yapınca kullanıma kapali olur.
    //bu çelişkidir, bu yuzden Java abstract methodların private olmasına müsaade etmez.

    //"abstract method" lar "static" olamazlar,cunku static methodlar override edilemez,
    //halbuki abstract method lar override edilmek için oluşturulmustur.



}
