import java.beans.Transient;

//all the methods - public abstract
//all the vars - final static
//does not have memory in heap so vars are final stored in stack
//Used for Loose coupling - you pass both laptop and desktop

//Functional Interface - single abstract method
//can use lambda expression using FI
//marker interface - used for serialization and deserialization
interface Computer{
    int x = 1;
    void show();
}

class Laptop implements Computer{
    public void show(){
        System.out.println("Running in Laptop");
    }
}

class Desktop implements Computer{
    public void show(){
        System.out.println("Running in Desktop");
    }
}
class Employee{
    @Transient //means not passing info of this
    //used in serialization 
    public void work(Computer c){
        c.show();
    }
}

@FunctionalInterface
interface Book{
    void Pen();
}

@FunctionalInterface
interface Booky{
    int Penny(int x,int y);
}
public class Interfaces {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.work(new Laptop());
        e.work(new Desktop());
        Computer c = new Computer() {
            @Override
            public void show() {
                System.out.println("Used anonymous class of " +
                        "Computer Interface");
            }
        };
        c.show();
        //lambda expression
        Book b = () -> {
            System.out.println("Called Pen");
        };
        b.Pen();
        Book b1 = () -> System.out.println("Called Pen 1");
        b1.Pen();

        Booky b2 = (i,j) -> i+j;
        System.out.println("Answer is "+ b2.Penny(2,3));
    }
}
