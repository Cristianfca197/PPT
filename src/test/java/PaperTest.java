import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

public class PaperTest {
    @Test
    public void testNewPaper(){
        Paper paper = new Paper();
        assertNotNull(paper);
    }
}
