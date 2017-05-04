import org.junit.Test;

public class TestMaven2{

    SecondPage page2 = new SecondPage();
    @Test
    public void Page1() throws InterruptedException{
        page2.get();
        page2.quite();
    }
}
