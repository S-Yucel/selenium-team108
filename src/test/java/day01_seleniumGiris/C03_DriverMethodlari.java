package day01_seleniumGiris;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //amazon anasayfaya gidin . gittiginiz sayfadaki title ve url i yazdirin


        driver.get("https://amazon.com");
        System.out.println("baslik : " + driver.getTitle());
        System.out.println("URL : " + driver.getCurrentUrl());
        Thread.sleep(2000);

        //amazon anasayfaya gittiginizi test edin

        String expectedIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains(expectedIcerik)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        driver.close();
    }
}
