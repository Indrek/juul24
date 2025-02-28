package composition;

public class Lamp {

    private String colour;
    private boolean isOn;

    public Lamp(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public boolean isOn() {
        return isOn;
    }

    public void switchLamp() {
        if (isOn) {
            isOn = false;
        }
        else {
            isOn = true;
        }

        //isOn = !isOn; //lihtsustatud variant
    }
}
