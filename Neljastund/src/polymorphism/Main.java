package polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "Sisu pole";
    }
}
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Hai sööb inimesi";
    }
    public void meetod() {
        System.out.println("Test123");
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Tulnukad ründavad Maad";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Noored põgenevad labürindist";
    }
}

class Titanic extends Movie {
    public Titanic() {
        super("Titanic");
    }

    @Override
    public String plot() {
        return "Laev upub";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
}

public class Main {


    public static void main(String[] args) {

        Movie movie = new Jaws();
        Jaws jaws = new Jaws();


        for(int i = 1; i < 11; i++) {
            //andmetüüp muutujaNimi = väärtus
            Movie randomMovie = randomMovie();
            System.out.println("Film #" + i + ": " + randomMovie.getName());
            System.out.println("Sisu: " + randomMovie.plot());
            System.out.println();

        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        //random() annab arvu 0 ja 1 vahel
        //castimine (ühest andmetüübist teiseks)
        //esmalt arvutame, siis castime
        System.out.println("Random number: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Titanic();
            case 5:
                return new Forgettable();
            default:
                return null;
        }
    }

}
