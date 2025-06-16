import java.util.ArrayList;
import java.util.List;

public class Playlist implements Aggregate {
    private List<Music> musics = new ArrayList<>();

    public void addMusic(Music music) {
        musics.add(music);
    }

    public List<Music> getMusics() {
        return musics;
    }

    @Override
    public Iterator createIterator() {
        return new PlaylistIterator(musics);
    }
}
