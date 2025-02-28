package abstractclass;

public class Bat extends Animal implements CanFly{

    public Bat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " nosib");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " ka hingab");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " oskab ka lennata");
    }
}
