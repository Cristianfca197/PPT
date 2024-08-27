import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

public class RockTest {
    @Test
    public void testNewRock(){
        Rock rock = new Rock();
        assertNotNull(rock);
    }
}
