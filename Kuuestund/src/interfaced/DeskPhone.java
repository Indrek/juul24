package interfaced;

public class DeskPhone implements Telephone{

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Lauatelefonil pole toitenuppu");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Helistame " + phoneNumber + " lauatelefonilt");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Vastame lauatelefonile");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Kill kõll");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
