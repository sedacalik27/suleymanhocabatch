package day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {

        Student myStd=new Student();


        //Student 1
        System.out.println(myStd.getStdId());//AC123
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());

        //Student 2
        myStd.setStdId("TH123");
        myStd.setGpa(4.0);
        myStd.setPoor(false);
        System.out.println(myStd.getGpa());//4.0







    }
}
