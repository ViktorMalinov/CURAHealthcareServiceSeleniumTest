import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InstallDriversTest {

    @Disabled
    @Test
    public void chromeSession() {
        WebDriverManager.chromedriver().setup();

        //ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.quit();
    }

    @Disabled
    @Test
    public void edgeSession() {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.quit();
    }


    @Disabled("Only runs on Windows")
    @Test
    public void ieSession() {
        WebDriverManager.iedriver().setup();

        WebDriver driver = new InternetExplorerDriver();

        driver.quit();
    }
}

