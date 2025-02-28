package playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs; //võib siin ka initseerida

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
        //kui ei initseeri, siis this.songs = null (tühi / pole olemas)
    }
    private Song findSong(String title){
        for (Song checkedSong : this.songs) {
            //for each
            //enhanced for loop
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        //tagaplaanil ilmselt midagi taolist
//        for (int i = 0; i<this.songs.size(); i++) {
//            Song checkedSong = this.songs.get(i);
//        }
        return null;
    }
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) { //lugu ei ole listis
            this.songs.add(new Song(title, duration));
            return true;
        }
        //juhul, kui pole null, siis lugu on juba olemas
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        //kui laul on albumis, salvestub siia. Kui mitte, siis ta on null

        if (checkedSong == null) {
            System.out.println("Lugu ei leitud");
            return false;
        }
        playList.add(checkedSong);
        return true;
    }
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1; //arvuti loeb 0-st, inimene 1-st
        if(index < 0 || index >= this.songs.size()) {
            System.out.println("Lugu ei leitud");
            return false;
        }
        playList.add(this.songs.get(index));
        //playList on sisendlist (tuleb parameetrist)
        // .add(mida me lisame)
        // .get(listidele sisse ehitatud meetod, mille kaudu saame elemendi)
        // index = koordinaat, kus see element asub
        return true;
    }
}
