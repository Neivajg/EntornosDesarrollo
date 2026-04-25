package test.java.songtdd;

import main.java.songtdd.TDDSong;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TDDSongTest {

    @Test
    public void listaVacia() {
        assertEquals("", TDDSong.song(new String[]{}));
    }

    @Test
    public void fly() {
        assertEquals(
                "There was an old lady who swallowed a fly.\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n",
                TDDSong.song(new String[]{"fly"})
        );
    }
}