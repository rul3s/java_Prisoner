import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Raul on 03/05/2015.
 * Here we test some of the most common games with strategies
 */
public class PlayTest {
    Player a;
    Player b;


    @Test
    public void testGameCandidaCandida() throws Exception {
        Play play = new Play("candida","candida",50);
        play.startGame();

        assertEquals(play.getaYears(), 100);
        assertEquals(play.getbYears(),100);
    }

    @Test
    public void testGameXulaXula() throws Exception {
        Play play = new Play("xula","xula",50);
        play.startGame();

        assertEquals(play.getaYears(), 50);
        assertEquals(play.getbYears(), 50);
    }

    @Test
    public void testGameCandidaXula() throws Exception {
        Play play = new Play("candida","xula",20);
        play.startGame();

        assertEquals(play.getaYears(), 0);
        assertEquals(play.getbYears(), 60);
    }

    @Test
    public void testGameCandidaIntelliJ() throws Exception {
        Play play = new Play("candida","intellij",20);
        play.startGame();

        assertEquals(play.getaYears(), 28);
        assertEquals(play.getbYears(), 46);
    }

    @Test
    public void testGameIntelliJXula() throws Exception {
        Play play = new Play("intellij","xula",20);
        play.startGame();

        assertEquals(play.getaYears(), 20);
        assertEquals(play.getbYears(), 20);
    }
}