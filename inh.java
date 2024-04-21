// class Animal {
//     void sleep() {
//         System.out.println("Animal need sleep");
//     }
// }

// class Tiger extends Animal {

// }

// public class inh {
//     public static void main(String[] args) {
//         Tiger obj1 = new Tiger();
//         obj1.sleep();
//     }
// }

// class Demo1 {
//     void disp() {
//         System.out.println("Disp written in demo1 class");
//     }
// }

// class Demo2 extends Demo1 {

// }

// class Demo3 extends Demo2 {

// }

// public class inh {
//     public static void main(String[] args) {
//         Demo3 d = new Demo3();
//         d.disp();
//     }
// }

// class Animal {
//     void sleep() {
//         System.out.println("Animal need sleep!");
//     }
// }

// class Tiger extends Animal {

// }

// class Monkey extends Animal {

// }

// class Deer extends Animal {

// }

// class inh {
//     public static void main(String[] args) {
//         Deer obj = new Deer();
//         obj.sleep();
//     }
// }

class Aeroplane {
    public void takeOff() {
        System.out.println("Aeroplane is taking off");
    }

    public void fly() {
        System.out.println("Aeroplane is flying!!");
    }
}

class Cargoplane extends Aeroplane {
    public void fly() {
        System.out.println("Cargoplane flies at lower height");
    }
}

class PassengerPlane extends Aeroplane {
    public void fly() {
        System.out.println("Passenger Plane flies at medium hieght");
    }
}

class inh {
    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();
        cp.takeOff();
        cp.fly();

        PassengerPlane ps = new PassengerPlane();
        ps.takeOff();
        ps.fly();
    }
}