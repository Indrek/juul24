package abstractclass;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " nokitseb");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " hingab kiiresti");
    }
    public void fly() {
        System.out.println(getName() + " vehib tiibadega");
    }
}
