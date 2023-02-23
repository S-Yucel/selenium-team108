package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver","drivers/chromedriver_win32.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getWindowHandle());
        //CDwindow-1B18F2BDF263C52AB3EC5D503790AF0F
        driver.getWindowHandles();
        //CDwindow-8EC98F4A37834BCF9726D60BDD7F3270

        driver.manage().window().maximize();
        System.out.println(driver.getPageSource());
        String expectedIcerik = "2 hours weekly meeting";
        String actualSayfaKodlari = driver.getPageSource();
        if(actualSayfaKodlari.contains(expectedIcerik)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        driver.quit();

    }
}
