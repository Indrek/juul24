package playlist;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        Teeme programmi, mis imiteerib laulude playlisti
        Song klassi, kus on nimi ja pikkus
        Album klass, mis hoiab listi lauludest
        Albumi kaudu saame lisada laule playlisti
        Kui laulud on lisatud, siis menüü:
        quit, skip edasi, skip tagasi, replay, print playlist, print menüü, (remove)
         */

        Song testSong = new Song("Test", 1.23);
        System.out.println(testSong.toString());
        System.out.println(testSong);

        ArrayList<Album> albums = new ArrayList<>();
        Album album = new Album("Juku Album", "Juku");
        album.addSong("A1",1);
        album.addSong("A2",2);
        album.addSong("A3",3);
        album.addSong("A4",4);
        album.addSong("A5",5);
        album.addSong("A6",6);
        albums.add(album);

        album=new Album("Juhani album", "Juhan");
        album.addSong("B1",1);
        album.addSong("B2",2);
        album.addSong("B3",3);
        album.addSong("B4",4);
        album.addSong("B5",5);
        album.addSong("B6",6);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("A1",playList);
        albums.get(0).addToPlaylist("A3",playList);
        albums.get(0).addToPlaylist(5,playList);
        albums.get(0).addToPlaylist(6,playList);

        albums.get(1).addToPlaylist("B2",playList);
        albums.get(1).addToPlaylist("B4",playList);
        albums.get(1).addToPlaylist(6,playList);
        albums.get(1).addToPlaylist(1,playList);

        albums.get(0).addToPlaylist("C123",playList); //pole olemas
        albums.get(1).addToPlaylist(13,playList); //pole olemas

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = playList.listIterator();
        boolean quit = false;
        boolean goingForward = true;

        printMenu();
        if(playList.isEmpty()) {
            System.out.println("Playlist on tühi");
            return;
        }
        System.out.println("Praegu mängib: " + listIterator.next());

        while(!quit) {
            System.out.println("Sisesta valik: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0: //välju
                    System.out.println("Väljun");
                    quit = true;
                    break;
                case 1: //edasi

                    if(!goingForward) { //ümberpöörde moment (kui eelmine liigutus oli tagasi)
                        if(listIterator.hasNext()) { //kontrollime, kas me üldse saame edasi minna
                            listIterator.next(); //liigutame salaja iteraatori 1 võrra edasi
                        }
                    }
                    goingForward = true;
                    if(listIterator.hasNext()) {
                        System.out.println("Käib lugu: " + listIterator.next());
                    } else {
                        System.out.println("Jõudsime listi lõppu");
                        goingForward = false;
                    }
                    break;
                case 2: //tagasi

                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    goingForward = false;
                    if(listIterator.hasPrevious()) {
                        System.out.println("Käib lugu " + listIterator.previous());
                    } else {
                        System.out.println("Jõudsime listi algusesse");
                        goingForward = true;
                    }
                    break;
                case 3: //replay
                    //Senikaua, kuni 3 vajutame, siis kuvab sama lugu
                    break;
                case 4: //kuva listis olevad lood
                    printList(playList);
                    break;
                case 5: //printib menüü
                    printMenu();
                    break;
                case 6: //remove
                    listIterator.remove(); //see meetod kustutab laulu
                    //välju, kui rohkem kustutada ei saa (ehk playlist tühi)
                    break;


            }
        }
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=================");
    }

    private static void printMenu() {
        System.out.println("""
                Valikud:
                0 - Välju
                1 - Järgmine lugu
                2 - Eelmine lugu
                3 - Korda lugu
                4 - Kuva listis olevad lood
                5 - Näita valikuid
                6 - Kustuta lugu""");
    }

}
