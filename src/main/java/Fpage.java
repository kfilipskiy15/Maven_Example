import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Fpage {
    FirefoxDriver driver1 = new FirefoxDriver();


    public void get1() {
        driver1.get("http://www.oracle.com/technetwork/java/javase/downloads/index.html");
    }

    public void quite1(){
        driver1.quit();
    }
}