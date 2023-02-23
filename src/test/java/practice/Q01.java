package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01 {
    /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */
    public static void main(String[] args) {
        //Set Path
        WebDriverManager.chromedriver().setup();
       //Bu satirda sisteme driveri tanitiyoruz ve yolunu gosteriyoruz

       //Create chrome driver
        WebDriver driver = new ChromeDriver(); //bu adimda hangi
        // tarayicida calistiracagimi belirliyoruz.Chross testingde ihtiyacimiz olacak.
        //baska tarayici kullanacaksak driverinida driver dosyamiza eklemeliyiz
        // Chrome icin yaptigimiz gibi

        //Maximize the window
        driver.manage().window().maximize();

        //Open google home page https://www.google.com/.get metodu hizli calisir
        driver.get("https://www.google.com");

        //On the same class, Navigate to amazon home page.Bagimli senaryolarda kullanilir
        driver.navigate().to("https://www.amazon.com");

        // https://www.amazon.com/ Navigate back to google
        driver.navigate().back();

        //Navigate forward to amazon
        driver.navigate().forward();

        //Refresh the page
        driver.navigate().refresh();

        //Close/Quit the browser
        driver.quit(); //tum sayfalari kapatir. .close ise son acik sayfayi kapatir

        //And last step : print "All Ok" on console
        System.out.println("All Ok");

    }
}
