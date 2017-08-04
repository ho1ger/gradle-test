package Hello;

import org.junit.Test;

import java.lang.reflect.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static junit.framework.TestCase.assertTrue;

public class HelloTest{

    public HelloTest() {
    }

    @Test
    public void testTime() throws Exception {
        Hello hello = new Hello();
        String time = hello.tellTime();
        Pattern p = Pattern.compile("[A-Za-z:]+[\\d]{2}:[\\d]{2}:[\\d]{2}.[\\d]{1,3}");
        Matcher m = p.matcher(time);
        assertTrue(time.length() > 0);
        assertTrue(m.matches() == true);
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

