import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SncfProject {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void OpenChrome() {

        driver.get("https://www.oui.sncf/");
        driver.manage().window().maximize();

        //ACCEPTER LES COOKIES UNE BONNE FOIS SUR TOUTES LES PAGES
        String AcceptCookiesID ="didomi-notice-agree-button";
        WebElement AcceptCookies = driver.findElement(By.id(AcceptCookiesID));
        AcceptCookies.click();

    }

    @AfterMethod
    public void CloseChrome() {
        //driver.quit();
    }

    @Test
    public void Etape () {

    }


}
