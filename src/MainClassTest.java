import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassString(){

        MainClass mainClass = new MainClass();
        String originalString = mainClass.getClassString();
        String subString = "hello";

        Assert.assertTrue("Original string doesn't contain expeted substring",   originalString.contains(subString) || originalString.contains("Hello"));
    }
}