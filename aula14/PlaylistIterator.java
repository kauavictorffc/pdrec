import java.util.List;

public class PlaylistIterator implements Iterator {
    private List<Music> playlist;
    private int position = 0;

    public PlaylistIterator(List<Music> playlist) {
        this.playlist = playlist;
    }

    @Override
    public boolean hasNext() {
        return position < playlist.size();
    }

    @Override
    public Object next() {
        return hasNext() ? playlist.get(position++) : null;
    }
}
