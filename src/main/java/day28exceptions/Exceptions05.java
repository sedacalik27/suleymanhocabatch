package day28exceptions;

public class Exceptions05 {
    public static void main(String[] args) {
       int a=16;
       int b=2;
       String s="My Java";

        getCharFromString(s,a,b);

    }

    //try kisminda birden fazla Exception oluşturma ihtimali olan kod varsa çoklu catch kullanabilirisniz
    //Çoklu catch kullandıgınızda Exception Class'lar arasinda "parent-child" ilişkisi yoksa ,
    //catch lerin sirasi önemli değildir.Ama kod'daki sıralamaya uymak tavsiye edilir.
    //Çoklu catch kullandıgınızda Exception Class'lar arasinda "parent-child" ilişkisi varsa ,
    //catch lerin sirasi önemlidir,child olan class ustte olmalıdır.

    //Exception Class'lar arasinda "parent-child" ilişkisi varsa ,ya chid class i uste yazarak
    //child ve parent class'lar için özelleştirilmiş code lar yazarsınız(hırsız için 155,hasta için 112 gibi)
    //Veya child2ı hiç kullanmaz sadece parent ile exception'lari handle etmeye calisirsınız.(hırsız için 911,hasta için 911 gibi)
    public static void getCharFromString(String s,int a,int b){


        try{


        int idx=a/b;//AritmeticException riski var

        char ch= s.charAt(idx);//StringIndexOutOfBoundsException

        System.out.println(ch);


        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
        }
    }
}
