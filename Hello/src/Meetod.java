public class Meetod {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 500;

        if(gameOver) {
            int finalScore = score + levelCompleted * bonus;
            System.out.println(finalScore);
        }
        calculateScore(true, 3000, 6, 50); //viitab meetodile, teeb seal sees asjad ära
        //läheb siit edasi
        int number = calculateScore(false,score,levelCompleted,bonus) + 600;
        System.out.println(number + 1000);
        displayPosition("Juku", 3);
        System.out.println(calculatePosition(1000));

        displayPosition("Juhan",calculatePosition(calculateScore(true,score,levelCompleted,bonus)));




    }
    public static int calculateScore(boolean gameOver, int score,
                                      int levelCompleted, int bonus) {

        int finalScore = 0;
        if(gameOver) {
            finalScore = score + levelCompleted * bonus;
            System.out.println(finalScore);
        }
        return finalScore;
    }
    public static void displayPosition(String nimi, int positsioon) {
        System.out.println(nimi + " saavutas " + positsioon + ". koha tabelis");
    }

    public static int calculatePosition(int score) {
        int position = 4;
        if(score >= 1000) {
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position = 3;
        }
        return position;
    }



    /*
    Ülesanne
    1) Tee meetod displayPosition (ei returni midagi (void))
    2) Esimene sisend - mängija nimi (String)
    3) Teine sisend - positsioon, mille ta saavutas edetabelis (int)
    näiteks sisend: "Juku", 3
    4)Printib nimi saavutas x. koha tabelis
    näiteks: "Juku saavutas 3. koha tabelis"

    5)Tee meetod nimega calculatePosition (returnib int)
    6)Üks sisend: mängija skoor (int)
    7)returnib väärtuse järgnevalt:
        returnib 1, kui skoor on suurem-võrdne kui 1000
        returnib 2, kui skoor on suurem-võrdne kui 500 ja väiksem kui 1000
        returnib 3, kui skoor on suurem-võrdne kui 100 ja väiksem kui 500
        returnib 4 muudel juhtudel
     */
}
