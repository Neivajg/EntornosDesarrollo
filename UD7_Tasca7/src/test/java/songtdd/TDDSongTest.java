package test.java.songtdd;

import main.java.songtdd.TDDSong;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TDDSongTest {
    @Test
    public void listaVacia() {
        assertEquals("", TDDSong.song(new String[]{}));
    }
}