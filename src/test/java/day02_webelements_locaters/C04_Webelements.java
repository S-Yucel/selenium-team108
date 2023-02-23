package day02_webelements_locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Webelements {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon anasayfaya gidin

        driver.get("https://amazon.com");

        //sonra arama kutusunu locate edip bir webelement olarak kaydedin
        //id si "twotabsearchtextbox" olan webelement seklinde locate ediniz


        /*
        drivera webelementi tarif etme islemine lOCATE,
        bu tarifi yapabilmek icin kullanabilecegim degiskenlerede LOCATER denir
        8 tane locater vardir.
        locaterlardan 6 tanesi webelementin ozelliklerine baglidir
            1-id
            2-className
            3-name
            4-tagName
            5-linkText
            6-partialLinkText
        geriye kalan 2 tanesi ise her turlu webelementi locate etmek icin kullanilir
         */

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        //arama kutusuna "Nutella" yazip aratin

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        Thread.sleep(500);

        driver.navigate().back();

        WebElement searchButton = driver.findElement(By.name("field-keywords"));
        searchButton.sendKeys("Flowers");
        searchButton.submit();

        driver.close();
    }
}
