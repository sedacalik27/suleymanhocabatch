package day22staticblocksconstructors;




        /*
            Constructor nedir?
        Class dan obje üretmemize yarayan code blocklaridir

        class oluşturdugumuzda java bize otomatik olarak bir constructor verir
        ama bu constructor gözle görilmez.gözle görülmeyen otomatik olarak java tarafindan verilen bu constructor lara
        "default constructor" denir

        default constructor' lar " Car(){} " şeklindedir.

       siz kendi, constructorınızı oluşturdugunuzda java default constructorı siler.

       Bir class da farkli parametreler kullanarak istediğiniz kadar constructor oluşturabilirsiniz

       farkli constructor lar sayesinde bir class dan farkli farkli object ler oluşturabiliriz.

       interview sorusu: method ile constructor ın farkı var mııdır? varsa nedir?
                      method ile constructor farklı yapılardır
                      1)methodlarda "return type" vardir ama constructorlarda "return type" yoktur.
                      2)methodlarin ismi yaptıkları işe göre devolaperlar tarafından belirlenir.
                        constructorlarin ismi ise her zaman class ismi ile aynidir

         */

public class Car {
    String make= "Honda";
    String model= " Accord";
    int year = 2023;
    boolean hybrid= true;


   public Car(String make, String model, int year, boolean hybrid){//bizinm oluşturdugumuz constructor
    this.make=make;
    this.model=model;
    this.year=year;
    this.hybrid=hybrid;

}

    public Car(String make,String model){
        this.make=make;
        this.model=model;

        if(year==2023){
            this.year=0;
        }
        if(hybrid==true){
            this.hybrid=false;
        }

    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
