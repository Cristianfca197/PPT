import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

public class RulesTest {
    private final Rock rock = new Rock();
    private final Paper paper = new Paper();
    private final Scissors scissors = new Scissors();

    @Test
    public void testRockBeatsScissors(){
        assertEquals(rock, rock.vs(scissors));
    }

    @Test
    public void testRockLostWithPaper() {
        assertEquals(paper, rock.vs(paper));
    }

    @Test
    public void testRockDrawWithRock(){
        assertNull(rock.vs(rock));
    }

    @Test
    public void testPaperBeatsRock(){
        assertEquals(paper, paper.vs(rock));
    }

    @Test
    public void testPaperLostWithScissors() {
        assertEquals(scissors, paper.vs(scissors));
    }

    @Test
    public void testPaperDrawWithPaper(){
        assertNull(paper.vs(paper));
    }

    @Test
    public void testScissorsBeatsPaper(){
        assertEquals(scissors, scissors.vs(paper));
    }

    @Test
    public void testScissorsLostWithRock() {
        assertEquals(rock, scissors.vs(rock));
    }

    @Test
    public void testScissorsDrawWithScissors(){
        assertNull(scissors.vs(scissors));
    }

}
