public class OOPsAbstract{

    public static void main(String[] args) {
        
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.changeColor);

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();

    }
}

abstract class Animal{

    String color;

    Animal(){                        //every animal will be created with default color "brown". construction creation
        color = "brown";
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();            //No implementation 
}

class Horse extends Animal{

    void changeColor(){             //Changing the default color

        color = "Black";
    }

    void walk(){                    //implementation of abstract method in a particular class
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{

    void walk(){                    //implementation of abstract method in a particular class
        System.out.println("walks on 2 legs");
    }
}