public class Main {

    public static void main(String[] args) {
        Album album = new Album();

        Song song = new Song("Nimi", 0.5);

        album.laulud.add(song);
        System.out.println(album.laulud.get(0));
    }


}
