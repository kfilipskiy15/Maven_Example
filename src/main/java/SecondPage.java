import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SecondPage {
    FirefoxDriver driver = new FirefoxDriver();


    public void get() {
        driver.get("http://junit.org/junit5/docs/current/user-guide/#dependency-metadata");
    }

    public void quite(){
        driver.quit();
    }

    public void geta(){
        driver.get("https://www.google.com.ua/?gfe_rd=cr&ei=mgAFWdSJMemA6ATinIWoAQ");
    }
    public void quite1(){
        driver.quit();
    }
}