import org.junit.Test;


public class TestMaven  {
    SecondPage page2 = new SecondPage();
     @Test
    public void page2() throws InterruptedException{
        page2.get();
        page2.quite();
    }
    @Test
    public void page3() throws InterruptedException{
        page2.geta();
        page2.quite1();
    }
}

