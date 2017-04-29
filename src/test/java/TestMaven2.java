import org.junit.Test;

public class TestMaven2{

    Fpage fpage = new Fpage();
    @Test
    public void Page1() throws InterruptedException{
        fpage.get1();
        fpage.quite1();
    }
}
