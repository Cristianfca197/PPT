import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

public class ScissorsTest {
    @Test
    public void testNewScissors(){
        Scissors scissor = new Scissors();
        assertNotNull(scissor);
    }
}
