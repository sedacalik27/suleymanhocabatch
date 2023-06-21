package day24accessmodifiersinheritance;

public class Student {
    //name herkes tarafından bilinebilir o yüzden "public" yaptım
    public String name= "Tom Hanks";
    //student ıd okul yönetimindekiinsanlar tarafindan bilinebilir, oyüzden "default" yaptım
     String stdId= "TH2023HU12001";
     //accaunt number ben eşim ve çocuklarım tarafından bilinebilir,o yüzden "protected" yaptım
    protected int accountNum=76512345;
    //hesabımdaki para miktari sadece benim tarafimdan bilinmelidir,bu yüzden "private" yaptım.
    private int balance = 123000;
    /*
    1)access modifier lar genişden dara ;public>protected>default>private
    2)Classlar protected ve private olamazlar,sadece public ve default olabilirler.
    3)Access modifier lar ne işe yarar?
         -variablelara methodlara classlara ulaşmayi düzenler
     4) kaç tane AM var ? 4 tane
           i)"public " ler için hiçbir sınırlama yoktur projenin heryerinden ulaişılabilir
           ii)"protected" ayni package in içinden yada farkli packagelarda o packagedeki çocuklari ulaşabilir.
           iii) "default" sadece ayni package dan ulaşılabilir.
               bu yüzden defaultlarin deiger adı" package private" dir
           iv)" private" sadece class içinden ulaşılabilir,class dışına çıkıldıgında ulaşılamaz

                protected ile default farki nedir?
               Package dışına çıktıgımızda childlardan protectedlara ulaşabiliriz."defaultlara " ulaşamayiz.


     */



}
