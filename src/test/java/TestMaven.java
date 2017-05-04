import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


public class TestMaven  {
    Fpage page = new Fpage();
     @Test
    public void page2() throws InterruptedException{
        page.get();
        page.quite();
    }
    @Test
    public void page3() throws InterruptedException{
        page.get1();
        page.quite1();
    }
    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }
}

