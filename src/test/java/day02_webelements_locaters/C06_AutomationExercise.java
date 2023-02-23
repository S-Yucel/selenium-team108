package day02_webelements_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_AutomationExercise {
    public static void main(String[] args) {
       //1- Bir test class’i olusturun ilgili ayarlari yapin
       //2- https://www.automationexercise.com/ adresine gidin
       //3- Sayfada 147 adet link bulundugunu test edin.
       //4- Products linkine tiklayin
       //5- special offer yazisinin gorundugunu test edin
       //6- Sayfayi kapatin
        /*
        automationexercise.com
        Automation Exercise
        This is for automation practice
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");

        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkElementleriList = driver.findElements(By.tagName("a"));

        int expectedLinkSayisi=147;
        int actualLinkSayisi=linkElementleriList.size();
        if(expectedLinkSayisi==actualLinkSayisi){
            System.out.println("Link sayi testi PASSED");
        }else{
            System.out.println("Link sayi testi FAILLED");
        }


        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText(" P" +
                "roducts")).click();

        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElement = driver.findElement(By.id("sale_image"));
        if(specialOfferElement.isDisplayed()){
            System.out.println("Special offer testi PASSED");
        }else {
            System.out.println("Special offer testi FAILED");
        }
        //6- Sayfayi kapatin
        driver.close();

    }
}
