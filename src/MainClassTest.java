import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassString(){

        MainClass mainClass = new MainClass();
        String originalString = mainClass.getClassString();
        String subStringLow = "hello";
        String subStringCap = "Hello";

        Assert.assertTrue("Original string doesn't contain expeted substring",   originalString.contains(subStringLow) || originalString.contains(subStringCap));
    }
}