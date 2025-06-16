public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addMusic(new Music("Imagine", "John Lennon"));
        playlist.addMusic(new Music("Bohemian Rhapsody", "Queen"));
        playlist.addMusic(new Music("Hotel California", "Eagles"));

        Iterator iterator = playlist.createIterator();

        while (iterator.hasNext()) {
            Music m = (Music) iterator.next();
            System.out.println(m.getTitle() + " - " + m.getArtist());
        }
    }
}
