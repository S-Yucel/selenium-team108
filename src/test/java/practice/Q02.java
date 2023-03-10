package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {
    public static void main(String[] args) throws InterruptedException {

    /* ...Exercise2...*/

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        //1 - Driver olusturalim
        //WebDriverManager.chromedriver().setup();

        //2 - Java class'imiza chromedriver.exe'yi tanitalim
        WebDriver driver = new ChromeDriver();

       // 3 - Driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();

        //4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
            //söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        Thread.sleep(10000);

        //5 - "https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");

        //6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String ottoTitle = driver.getTitle();
        String ottoUrl = driver.getCurrentUrl();

       // 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
        if (ottoTitle.contains("OTTO") && ottoUrl.contains("OTTO")){
            System.out.println("OTTO yazisi vardir.Test PASSED" + ottoTitle);
        }else{
            System.out.println("OTTO yazisi icermiyor.Test FAILED" + ottoUrl);
        }
       // 8 - Ardindan "https://wisequarter.com/" adresine gidelim
        driver.navigate().to("https://www.wisequarter.com");
       // 9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
            //kontrol edelim
        String wqTitle = driver.getTitle();
        if (wqTitle.contains("wisequarter")){
            System.out.println("wisequarter yazisi vardir.Test PASSED" + wqTitle );
        }else{
            System.out.println("wisequarter yazisi icermiyor.Test FAILED" + wqTitle);
        }
        boolean isTrue = wqTitle.contains("quarter");
            if (isTrue) {
                System.out.println("TEST PASSED");
            } else {
                System.out.println("TEST FAILLED");
            }

        //10- Bir onceki web sayfamiza geri donelim
        //11- Sayfayi yenileyelim
        //12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim

        //13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();
    }
}
