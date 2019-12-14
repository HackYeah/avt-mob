import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber(){

        MainClass mainClass = new MainClass();
        int actual = mainClass.getLocalNumber();
        int expected = 14;

        Assert.assertTrue("Actual number is not equal to expected ", expected == actual);
    }
}