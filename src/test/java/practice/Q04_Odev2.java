package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04_Odev2 {
    /* ...Exercise4...

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        Thread.sleep(Duration.ofSeconds(15));

      // Click on  Calculater under Micro Apps
        WebElement microApps = driver.findElement(By.xpath("/html/body/div/h2[3]"));

        WebElement calculator = driver.findElement(By.cssSelector("#calculatetest"));
        calculator.click();

        Thread.sleep(Duration.ofSeconds(5));

      // Type any number in the first input
        WebElement firstInput = driver.findElement(By.id("number1"));
        firstInput.sendKeys("1234");
        firstInput.click();

      // Type any number in the second input
        WebElement secondInput = driver.findElement(By.id("number2"));
        secondInput.sendKeys("78910");
        secondInput.click();

      // Click on Calculate
        WebElement calculate = driver.findElement(By.id("calculate"));
        calculate.click();

        Thread.sleep(Duration.ofSeconds(5));

      // Get the result
        WebElement result = driver.findElement(By.id("answer"));
        result.getText();


      // Print the result
        System.out.println("result = " + result.getText());

        driver.quit();
    }
}
