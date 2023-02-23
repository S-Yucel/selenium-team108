package day01_seleniumGiris;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        /*
        jar dosyalarini yukleyerek seleniumu kullanir hale getirdik
        ancak her bir classin hangi browser ile calismasini istiyorsak o browser
         ile ilgili classta tanimlamamiz lazim

         Browser ile ilgili tercihimiz dogrultusunda ilgili ayarlari yapmak icin
         Java daki System classindan setProperty() kullanilir

         methoda 2 parametre ekliyoruz
         1. parametre herkes icin ayni: webdriver.chrome.driver
         2. parametre bu driverin dosya yolu herkesin bilgisayarinda farkli olabilir
         windowslarda sonuna .exe yazilmalidir
         mac lerde exe olmaz

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //istenen sayfaya gitmek icin

        driver.get("http://wisequarter.com");

        Thread.sleep(4000);

        driver.close();
    }
}
