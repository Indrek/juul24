package interfaced;

public interface Telephone {

    //interface on abstraktne
    //interface sisse paneme meetodite nimed
    //iga klass, mis seda interface-i kasutab peab implementeerima need meetodid
    //ehk kirjutama meetoditele loogika

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

    //kõik meetodid on interfaces vaikimisi public, ei pea täpsustama

}
