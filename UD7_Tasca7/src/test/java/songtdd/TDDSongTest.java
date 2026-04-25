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

    @Test
    public void spider() {
        assertEquals(
                "There was an old lady who swallowed a spider.\n" +
                        "I don't know why she swallowed a spider - perhaps she'll die!\n",
                TDDSong.song(new String[]{"spider"})
        );
    }

    @Test
    public void flySpider() {
        assertEquals(
                "There was an old lady who swallowed a fly.\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                        "\n" +
                        "There was an old lady who swallowed a spider;\n" +
                        "That wriggled and wiggled and tickled inside her.\n" +
                        "She swallowed the spider to catch the fly;\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n",
                TDDSong.song(new String[]{"fly", "spider"})
        );
    }

    @Test
    public void spiderFly() {
        assertEquals(
                "There was an old lady who swallowed a spider.\n" +
                        "I don't know why she swallowed a spider - perhaps she'll die!\n" +
                        "\n" +
                        "There was an old lady who swallowed a fly;\n" +
                        "That wriggled and wiggled and tickled inside her.\n" +
                        "She swallowed the fly to catch the spider;\n" +
                        "I don't know why she swallowed a spider - perhaps she'll die!\n",
                TDDSong.song(new String[]{"spider", "fly"})
        );
    }
}