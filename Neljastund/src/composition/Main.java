package composition;

public class Main {

    public static void main(String[] args) {
        //Arvuti - case, motherboard, monitor

        Dimensions dimensions = new Dimensions(20,20,10);
        Case theCase = new Case("200B", "Dell", "500", dimensions);

        Monitor monitor = new Monitor("XL2411P", "Benq", 24, new Resolution(1920,1080));

        Motherboard motherboard = new Motherboard("B550", "Asus", 4, 6, "v1.23");

        PC thePC = new PC(theCase,monitor,motherboard);

        PC newPC = new PC(
                new Case("CaseModel", "CaseManu", "500", new Dimensions(1,2,3)),
                new Monitor("MonitorModel", "MonitorManu", 24, new Resolution(1,2)),
                new Motherboard("MBModel", "MBManu", 1,2,"v6.66")
        );

        thePC.getTheCase().pressPowerButton();
        thePC.getMotherboard().loadProgram("IntelliJ");
        thePC.getMonitor().drawPixelAt(1500,900,"punane");
        System.out.println(thePC.getMonitor().getNativeResolution().getWidth());


        thePC.powerUp();

        /*
        Tee üks tuba majast kasutades kompositsiooni
        4 seina, lagi ja kaks mööblit (nt lamp ja voodi)
        Seina puhul väljaks suund
        Lae puhul väljadeks kõrgus ja värv
        Vähemalt üks meetod, mis kasutab toas olevat objekti
        voodi -> meetod, mis teeb voodi korda
        lamp -> meetod, mis lülitab lambi sisse
        igasse klassi väljad, konstruktor, getterid
        Bed -> make()
        Room -> wakeUp() -> bed.make() ja lamp.turnOn()
         */

    }
}
