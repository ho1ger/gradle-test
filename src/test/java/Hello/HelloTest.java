package Hello;

import org.junit.Test;

import java.lang.reflect.*;

import static junit.framework.TestCase.assertTrue;

public class HelloTest{

    public HelloTest() {
    }

    @Test
    public void testTime() throws Exception {
        Hello hello = new Hello();
        String time = hello.tellTime();
        assertTrue(time.length() > 0);
    }

    @Test
    public void testGreet() throws Exception {
        Hello hello = new Hello();
        String greet = hello.tellTime();
        assertTrue(greet.length() > 0);
    }

    @Test
    public void getSet() throws Exception {
        Hello hello = new Hello();
        String input = "foo";
        hello.setText(input);
        String output = hello.doGreet();
        assertTrue(input == output);
    }
}

