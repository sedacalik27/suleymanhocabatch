package day28exceptions;

public class Exceptions03 {
    public static void main(String[] args) {
        String s= "Java";

        getCharFromString(s,2);
        getCharFromString(s,4);
    }

    //Stringlerde var olmayan index'ler kullanıldıgında Java StringIndexOutOfBoundsException atar.

    public static void getCharFromString(String s, int idx){
        try{
        char ch =s.charAt(idx);
        System.out.println(ch);
    }catch(StringIndexOutOfBoundsException e){
            System.out.println("olmayan index kullanma hatasi yaptiniz.."+ e.getMessage());
            e.printStackTrace();//handle etmeden önce ki hata mesaji,hatayi bütünüyle açıklıyor
            System.out.println(e.getCause());//hatanin sebebiyle alakalı bişeyler söylüyor
        }
}
}
    //e.getMessage demek teknik mesajı görmek demek :String index out of range: 4