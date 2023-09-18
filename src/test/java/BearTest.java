import com.codebase.Bear;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {
    @Test
    public void hasName() {
        Bear bear = new Bear("Baloo", 20, 523.12);
        assertEquals("Baloo", bear.getName());
    }
}
