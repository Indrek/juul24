package inheritance;

public class Main {

    /*
    inheritance - üks klass pärib teiselt klassilt kõik omadused
    ja funktsionaalsuse
    ühel klassil võib olla mitu alamklassi
    ühel klassil võib olla ainult üks ülemklass (võib pärida ainult ühelt)
     */

    public static void main(String[] args) {
        Animal animal = new Animal("Loom", 1, 1, 1, 1);
        animal.eat();
        animal.move(10);

        Dog dog = new Dog("Puudel", 10, 2, 2, 4,
                1, 26, "Karvane");
        System.out.println();
        dog.eat();
        System.out.println();
        dog.move(10);
        System.out.println();
        dog.walk();
        System.out.println();
        dog.run();
        System.out.println();

        Fish fish = new Fish("Heeringas", 10, 1, 2, 2, 4);

        fish.eat();
        System.out.println();
        fish.swim(7);


    }

}
