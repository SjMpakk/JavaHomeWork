/**
 * Java home work lesson 6
 *
 * @author Alexey Denisov
 * @version 1.1 Sep 30, 2018
 */


public class HomeWork6_1 {
    public static void main(String[] args) {
        System.out.println("for cat:");
        Cat cat = new Cat(1.9, 100, 2);
        System.out.println("for dog:");
        Dog dog = new Dog(2.1, 8, 4);


    }
}

class Cat extends Animal {
    Cat(double Jump, int Run, int Swim) {
        super(Jump, Run, Swim);
        double maxJump = 2.0;
        int maxRun = 200;
        if ((Jump >= 0) && (Jump <= maxJump))
            System.out.println("Jump: true");
        else System.out.println("Jump: false");
        if ((Run >= 0) && (Run <= maxRun))
            System.out.println("Run: true");
        else System.out.println("Run: false");
        if ((Swim <= 0) || (Swim >= 0))
            System.out.println("cat can't swim");

    }

}

class Dog extends Animal {
    Dog(double Jump, int Run, int Swim) {
        super(Jump, Run, Swim);
        double maxJump = 0.5;
        int maxRun = 500;
        int maxSwim = 10;
        if ((Jump >= 0) && (Jump <= maxJump))
            System.out.println("Jump: true");
        else System.out.println("Jump: false");
        if ((Run >= 0) && (Run <= maxRun))
            System.out.println("Run: true");
        else System.out.println("Run: false");
        if ((Swim >= 0) && (Swim <= maxSwim))
            System.out.println("Swim: true");
        else System.out.println("Swim: false");

    }

}

abstract class Animal {
    protected double Jump;
    protected int Run;
    protected int Swim;

    Animal(double Jump, int Run, int Swim) {
        this.Jump = Jump;
        this.Run = Run;
        this.Swim = Swim;
    }

}

