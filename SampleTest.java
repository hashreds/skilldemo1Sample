import static org.junit.Assert.*;
import org.junit.*;


public class SampleTest {    

@Test
public void printStringTest() {
    Sample s1 = new Sample();
    assertEquals("helo", s1.printString("hello"));

    }


}
