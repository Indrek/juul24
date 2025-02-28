package composition;

public class Bed {

    private int pillows;
    private int blankets;

    public Bed(int pillows, int blankets) {
        this.pillows = pillows;
        this.blankets = blankets;
    }

    public void make() {
        System.out.println("Teen voodit korda");
    }

    public int getPillows() {
        return pillows;
    }

    public int getBlankets() {
        return blankets;
    }
}
