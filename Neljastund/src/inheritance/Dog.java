package inheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,
               int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    public void run() {
        System.out.println(getName() + " Dog.run()");
        move(10); //otsib lähima move meetodi (sama klass, siis ülemklass)
    }
    public void walk() {
        System.out.println(getName() + " Dog.walk()");
        super.move(5); //võtab ülemklassist move meetodi (ignoreerib Dog klassi move)
    }
    public void eat() {
        chew();
        System.out.println(getName() + " Dog.eat()");
        super.eat();
    }
    private void chew() {
        System.out.println(getName() + " Dog.chew()");
    }

    @Override
    public void move(int speed) {
        moveLegs(speed);
        System.out.println(getName() + " Dog.move()");
        super.move(speed);
    }

    private void moveLegs(int speed) {
        System.out.println(getName() + " Dog.moveLegs() kiirusega " + speed);
    }
}
