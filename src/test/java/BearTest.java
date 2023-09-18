import com.codebase.Bear;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;

    @Before
    public void before() {
        bear = new Bear("Baloo", 20, 523.12);
    }

    @Test
    public void hasName() {
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(20, bear.getAge());
    }
}
