package interfaced;

public class MobilePhone implements Telephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobiiltelefon sisse lülitatud");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Helistame " + phoneNumber + " mobiiltelefonilt");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Vastame mobiiltelefonile");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ilus helin");
        } else {
            isRinging = false;
            System.out.println("Mobiil väljas või vale number");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
