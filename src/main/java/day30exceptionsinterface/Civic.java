package day30exceptionsinterface;



/*
      1)Bir interface i bir Class'ın parent i yapmak için "implements" keyword'unu kullaniriz.
      2)Java parent'lar "Class" oldugunda "multiple parent" a musaade etmez ama biz bazen
          "multiple parent" a ihtiyac duyariz.
        Bu ihtiyaci gidermek için Java "interface" ismini verdiği yeni bir yapi oluşturdu.
        Bu yapi sayesinde bir "Class" içi,n çoklu " interface parent" oluşturabiliriz.
      3)Coklu interface parent'ların herbirinin  içine aynı isimli method koyabiliriz
         Mesela Ac 'nin ,Engine'nin ve Security'nin içlerine "run()" koymak gibi
         Child Class herhangi birini override ettiğinde hepsini override etmiş gibi olur
         sonra da body'i Child Class'da yazarak uygulamasını yapmış olur.


 */
public class Civic implements Ac,Engine,Security {
    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("Ac run perfectly");

    }
}
