import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassString(){

        MainClass mainClass = new MainClass();
        String originalString = mainClass.getClassString();
        String subString = "hello";

        Assert.assertTrue("getClassNumber is smaller or equal than 45",   originalString.contains(subString) || originalString.contains("Hello"));
    }
}