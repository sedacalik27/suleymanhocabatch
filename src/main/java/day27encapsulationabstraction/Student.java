package day27encapsulationabstraction;

public class Student {

    private String stdId= "AC123";
    private double gpa= 3.99;
    private boolean poor=true;
    //Encapsulation yapılmış datayı okuyabilir miyiz?
    //get method lar encapsule edilmiş (saklanmış) datayı okumamıza yarar
    //get method lar (getter)herzaman "public " olur
    //get method larin (getter) return type i variable in data type i ile aynı olur.
    //get method larin (getter) isimleri get+ variable name şeklinde olur.
    //get method larin (getter) isimleri variable boolean ise "is+ variable name" şeklinde olur.
    //get method larin (getter) parametre kullanmazlar.

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }
    //Encopsulation yapilmış dataları değiştirebilir miyiz?

    //set method lar(setter) encopsule edilmiş data larin degerlerini değiştirmemize yarar.
    //set method lar(setter) her zaman "public" olur.
    //set method lar(setter) return type i her zaman void olur.
    //set method lar(setter) isimleri "set + variable name " şeklinde olur.
    //set method lar(setter) variable ile ayni data type inda parametre kullanırlar.
    //set methodlar kalıbta (yani classtaki degerleri) bulunanı değiştirmez,
    // set methodlar   objedeki degerleri değiştirir.

    // getter ve setter larin ikisine birden "Jva Beans" denir.
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}
