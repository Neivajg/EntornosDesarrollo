package test.java.songtdd;

import main.java.songtdd.TDDSong;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDDSongTest {

    @Test
    public void emptyList() {
        assertEquals("", TDDSong.song(List.of()));
    }

    @Test
    public void oneFly() {
        String expected =
                "There was an old lady who swallowed a fly.\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n";

        assertEquals(expected, TDDSong.song(List.of("fly")));
    }

    @Test
    public void oneSpider() {
        String expected =
                "There was an old lady who swallowed a spider.\n" +
                        "I don't know why she swallowed a spider - perhaps she'll die!\n";

        assertEquals(expected, TDDSong.song(List.of("spider")));
    }

    @Test
    public void flyAndSpider() {
        String expected =
                "There was an old lady who swallowed a fly.\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                        "\n" +
                        "There was an old lady who swallowed a spider;\n" +
                        "That wriggled and wiggled and tickled inside her.\n" +
                        "She swallowed the spider to catch the fly;\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n";

        assertEquals(expected, TDDSong.song(List.of("fly", "spider")));
    }

    @Test
    public void spiderAndFly() {
        String expected =
                "There was an old lady who swallowed a spider.\n" +
                        "I don't know why she swallowed a spider - perhaps she'll die!\n" +
                        "\n" +
                        "There was an old lady who swallowed a fly;\n" +
                        "That wriggled and wiggled and tickled inside her.\n" +
                        "She swallowed the fly to catch the spider;\n" +
                        "I don't know why she swallowed a spider - perhaps she'll die!\n";

        assertEquals(expected, TDDSong.song(List.of("spider", "fly")));
    }

    @Test
    public void flySpiderBird() {
        String expected =
                "There was an old lady who swallowed a fly.\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                        "\n" +
                        "There was an old lady who swallowed a spider;\n" +
                        "That wriggled and wiggled and tickled inside her.\n" +
                        "She swallowed the spider to catch the fly;\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                        "\n" +
                        "There was an old lady who swallowed a bird;\n" +
                        "How absurd to swallow a bird.\n" +
                        "She swallowed the bird to catch the spider,\n" +
                        "She swallowed the spider to catch the fly;\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                        "\n";

        assertEquals(expected, TDDSong.song(List.of("fly", "spider", "bird")));
    }

    @Test
    public void birdFlySpider() {
        String expected =
                "There was an old lady who swallowed a bird.\n" +
                        "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                        "\n" +
                        "There was an old lady who swallowed a fly;\n" +
                        "That wriggled and wiggled and tickled inside her.\n" +
                        "She swallowed the fly to catch the bird;\n" +
                        "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                        "\n" +
                        "There was an old lady who swallowed a spider;\n" +
                        "How absurd to swallow a spider.\n" +
                        "She swallowed the spider to catch the fly,\n" +
                        "She swallowed the fly to catch the bird;\n" +
                        "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                        "\n";

        assertEquals(expected, TDDSong.song(List.of("bird", "fly", "spider")));
    }
}