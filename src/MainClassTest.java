import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassNumber(){

        MainClass mainClass = new MainClass();
        int actual = mainClass.getClassNumber();
        int expected = 45;

        Assert.assertTrue("getClassNumber is smaller or equal than 45", expected < actual);
    }
}