
//When a class is dependent on an other class inner class
class Parent{
    Parent(){
        System.out.println("Parent");
    }
    void learn(){
        System.out.println("Learn");
    }
    class Child{
        Child(){
            System.out.println("Inner Child");
        }
        void display(){
            System.out.println("Display");
        }
    }
}

public class Inner {
    public static void main(String[] args) {
        Parent p = new Parent();
        //Child c = new Child(); cannot declare
        Parent.Child c = p.new Child();
        c.display();
        //useful to create onetime class
        Parent p1 = new Parent(){
            public void learn(){
                System.out.println("Learn Anonymous");
            }
        };
        p1.learn();
    }
}
