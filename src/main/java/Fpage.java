import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Fpage {
    FirefoxDriver driver1 = new FirefoxDriver();


    public void get() {
        driver1.get("http://www.oracle.com/technetwork/java/javase/downloads/index.html");
    }

    public void quite(){
        driver1.quit();
    }
    public void get1(){
        driver1.get("https://www.google.com.ua/?gfe_rd=cr&ei=mgAFWdSJMemA6ATinIWoAQ");
    }
    public void quite1(){
        driver1.quit();
    }
}