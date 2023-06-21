package day25inheritance;

public class Vehicle {

    /*
    1)Child class tan bir object oluşturdugunuzda Constructor lar en üstteki
     parent class dan başlatılarak alta dogru çalıstırılır.
    2)child classtaki constructordan parent class daki constructora gidebilmek için super() kullanilir
    3)parent class da birden fazla constructor varsa istenilen constructor, super() ifadesinin parantezi
      içine yazılan parametrelerin yardimi ile seçilebilir.
    4)aynı class içindeki constructorları seçmek için "this()" kullanılır.
       aynı class da birden fazla constructor var ise istenilen constructor "this()" ifadesinin
        parantezi içine yazılan parametreler yardımı ile secilebilir.
    5) " super()" ifadesini yazmak istege bağlıdır, yazmasanızda java sanki "super()" varmış gibi davranir
        ama kodunuzu daha okunur kılmak için yazmanız tavsiye edilir.

    6)"super()" ve "this()"  ifadeleri constructor içinde herzaman ilk satirda olmalıdır.
    7)bir constructor içinde "super()" ve "this()"  ifadeleri sadece bir kere kullanilabilir.bakınız 6.madde
    8)Inheritance da variable lari ve methodlari çagırmak için "this" veya "super" kullanilir
      "this" ayni class içindeki variable lari ve methodlari cagırmak için kullanılır.
      "super" parent class içindeki variable lari ve methodları cagırmak için kullanılır.


    9)Inheritance da object kullanarak variable çagırırsanız, objectin data type ini temsil eden class dan
      variable i aramaya başlayınız.O class da yoksa parentlara bakınız.
     10)Inheritance da object kullanarak method çagırırsanız, objectin constructor ini  temsil eden class' dan
      methodu  aramaya başlayınız.O class da yoksa parentlara bakınız.

      OOP principals:
      1)inheritance
      2)Polymorphism: method Overloading + Method overriding
      3)Encapsulation
      4)Abstraction

     */

    public int price=12000;
    public void engine(){
        System.out.println("Vehicle engine");
    }
    public Vehicle(){
        System.out.println("Vehicle 1");

    }
    public Vehicle(int price){
        System.out.println("Vehicle 2: " +price);
    }

    //method çagırırken constructora bakin
    //variable çagırırken data type e bakın

}
