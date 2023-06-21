package day22staticblocksconstructors;

public class StaticBlock01 {
    //bir variable oluşturdugunuzda deger atamazsanız o variable i "initialize" etmediniz demektir.
    //static variable lar static block lar içinde initialize edilirse o class in içinde herşeyden önce hazir hale getirilmiş olur
    //Bazen main method çalıştırılmadan önce variable larin hazır hale getirilmesi gerekir bu yuzden static block lar kullanılır.
    //note1:"static block" lar static variable lari initialize etmek için kullanılırlar.
    //note2:"static block" lar class içinde "herşeyden önce" çalıştırılırlar.
    static double pi;
    static String shape;

    static {
        pi=3.14;
        System.out.println("Static block 1");
    }

    static{
        shape="Circle";
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
    }





}
