package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {
    public static void main(String[] args) {
        /*
        1)method overloading yaparken method ismi değiştirilmez
        2)method overloading yapılırken parametreler değiştirilir
              a)parametre değiştirirken,  parametrelerin data type lari değiştirilebilir
              b)parametre değiştirirken  parametrelerin data type lari farkli ise yerleri değiştirilebilir
              c)parametre değiştirirken,parametrelerin sayısı değiştirilebilir.
        3)Java içim ismi ve parametreleri aynı olan iki method tamamıyle aynıdır.

         */

    add(3,5);





    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(double a, double b){
        System.out.println(a+b);
    }

    public static void add(double a, int b){
        System.out.println(a+b);
    }

    public static void add(int a, double b){
        System.out.println(a+b);
    }

    public static void add(int a, int b,int c){
        System.out.println(a+b+c);
    }






}
