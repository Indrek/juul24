package klassid;

public class Car {

    //klassi väljad (class fields) (muutujad)
    //kirjeldavad klassi omadusi
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //Setter - saame väärtust määrata
    public void setModel(String model) {

        String validmodel = model.toLowerCase();
        if(validmodel.equals("panamera") || validmodel.equals("astra")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

        //Car.model = model;
        //this viitab klassisisestele väärtustele
    }
    //Getter - saame väärtust vaadata
    public String getModel() {
        return model;
        //return this.model; //töötab ka
        //Kuna puudub samanimeline muutuja, siis "this." ees ei pea olema

    }



}
