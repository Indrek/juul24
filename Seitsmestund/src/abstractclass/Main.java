package abstractclass;

public class Main {

    public static void main(String[] args) {
        //abstraktne klass on klassi ja interface vahepealne

        Animal animal = new Animal("Loom") {
            @Override
            public void eat() {
                System.out.println(getName() + " sööb");
            }

            @Override
            public void breathe() {
                System.out.println(getName() + " hingab");
            }
        };
        animal.eat();
        animal.breathe();

        Dog dog = new Dog("Puudel");
        dog.eat();
        dog.breathe();

        Bird bird = new Bird("Lind") {};
        bird.eat();
        bird.breathe();
        bird.fly();

        Parrot parrot = new Parrot("Papagoi");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Pingviin");
        penguin.eat();
        penguin.breathe();
        penguin.fly();

        Bat bat = new Bat("Nahkhiir");
        bat.eat();
        bat.breathe();
        bat.fly();

        flySomewhere("põõsas", parrot);
        flySomewhere("koobas", bat);
    }

    public static void flySomewhere(String destination, CanFly who) {
        System.out.println( ((Animal) who).getName() + " lendab " + destination);
    }
}
