
class Animal {
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Pet extends Animal {
    Pet() {
        super();
    }

}

class Dog extends Pet {

}

public class Inherit3 {
    public static void main(String[] args) {
        Dog sheru = new Dog();
        sheru.sleep();
    }
}
