package day26overriding;

public class Animal {

    /*
    1)parent class daki method u child class içinde ozelleştirerek kullanmaya "Overriding " yapmak denir.
    2) Overriding de methodun parantezine, methodun ismine dokunulmaz,methodun body si değiştirilir.
    3)@Override ==> Override Annotation: override kurallarının Java tarafından kontrol edilmesini saglar.
    4)Overriding de parent class daki methoda "Overridden method" denir,
      child class daki methoda ise "Overriding Method" denir.
    5)private methodlar override edilemezler.
    6)child classtaki override edilmiş method(overriding method) 'un
      access modifier i parent class daki override edilmiş method(overridden method) 'un
      access modifier ından dar olamaz
      Overridden method==>protected  ise Overriding method==> protected + public
      Overridden method==>default  ise Overriding method==> default + protected+ public olabilir.
      Overridden method==>private  ise Overriding method==> override olmaz ki access modifier i olsun
    7) child class ta override edilen methodun (overriding method) return type i methodun return ettiği
       data type inin aynisi veya o data type inin parenti olarak secilebilir.
    8)methodun return type i primitive ise overriding yaparken return type değiştirilemez,
       çünkü return type ya aynı olur veya parenttan seçilir ama
       primitive ler arasında "parent child ilişkisi" olmadıgından parenttan seçmek mevzu bahis olamaz
       o zaman tek secenek aynısı olmalıdır kalır.

     9)  methodun return type i Wrapper class ise,overriding yaparken return type değiştirilemez
        çünkü return type ya aynı olur veya parenttan seçilir
        Ama java bir wrapper class ı diğerinin parent i yapmadıgından parenttan seçme ihtimali yoktur,
           geriye sadece aynisi olma ihtimali kalır.
      10)methodun return type i void ise,overriding yaparken return type  değiştirilemez.
      11)Final kelimesini "Variable" larda kullanabilirsiniz.
            ->final variable ise
               i)mutlaka deger atanmalıdır.
               ii) ilk atanan deger degiştirilemez

       12) Final kelimesini "Method" larda kullanabilirsiniz
             ->method final ise;
             i)methodun bodysi değiştirilemez
             ii) method body si değiştirilemeyince override yapmak mümkün olmaz


      13)final kelimesi "Class" larda kullanabilirsiniz
             -> class final ise ;
             i)o class ın child i olamaz
      14)"final" methodlar ve "static" methodlar override edilemezler.
      15)override yapabilmek için inheritance şarttır.baska bir ifadeyle ;parent-child ilişkisi şarttır.
      16) method overloading "compile time polymorphism dir, method overriding "run time polymorphism" dir.
      17) method overloading "static  polymorphism dir, method overriding "dynamic polymorphism" dir.
     */

    public void eat(){//parent daki override edilmiş eat() methoduna "overridden method" denir.
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...-");
    }
    public Animal create(){
        return new Animal();
    }

    public int add(int a,int b){
        return a+b;
    }

    public Integer multiply(int a,int b){
        return a*b;
    }

}
