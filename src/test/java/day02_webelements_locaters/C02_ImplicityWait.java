package day02_webelements_locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ImplicityWait {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        driveri bir web uygulamasina gonderdigimizde o sayfanin acilmasi, orada
        istedigimiz islemleri yapmak icin elementleri bulmasi,
        gibi islemler zaman alabilir.
        implicitlywait bu tur zaman isteyen islemler icin driverin max ne kadar
        bekleyecegini belirler
         */
    }
}
