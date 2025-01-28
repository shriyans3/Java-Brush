import java.util.*;

class Shriyans{
    static{
        System.out.println("Shriyans Static Block");
    }
    Shriyans() {
        System.out.println("Shriyans Constructor");
    }
    void p(){
        System.out.println("Shriyans P");
    }
}

class Child extends Shriyans{
    void p(){
        System.out.println("Shriyans P Child");
    }
}
public class Main extends Object {
    public static void main(String[] args) throws ClassNotFoundException{
        Class c = Class.forName("Shriyans");

        System.out.println(c);
        Shriyans s = (Shriyans) new Child(); //upcasting
        s.p();

        //downcasting
        Child c1 = (Child) s;
        c1.p();
        int a = 1;
        Integer x = a; // autoboxing (primitive to object)
        int b = x ; // autounboxing

    }
}