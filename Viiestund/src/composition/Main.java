package composition;

public class Main {

    public static void main(String[] args) {
        Room bedRoom = new Room(
                new Wall("Põhi"),
                new Wall("Lõuna"),
                new Wall("Ida"),
                new Wall("Lääs"),
                new Ceiling(3, "Valge"),
                new Bed(2,1),
                new Lamp("Sinine")
        );
        bedRoom.getLamp().switchLamp();
        bedRoom.wakeUp();

    }

}
