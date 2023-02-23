package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03_Odev1 {
    /* ...Exercise3...

 */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        WebElement firstName =
                driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"" +
                        "]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input"));
        firstName.sendKeys("Sry");

        Thread.sleep(Duration.ofSeconds(1));

        //fill the lastname
        WebElement lastName =
                driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]" +
                        "/div[1]/div/div/h2[2]/div[1]/div/div[5]/input"));
        lastName.sendKeys("ycl");

        Thread.sleep(Duration.ofSeconds(1));

        //check the gender
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"sex-1\"]"));
        gender.click();



        Thread.sleep(Duration.ofSeconds(1));

        //check the experience
        WebElement experience = driver.findElement(By.xpath("//*[@id=\"exp-0\"]"));
        experience.click();
        experience.isSelected();

        Thread.sleep(Duration.ofSeconds(1));

        //fill the date
        WebElement date =
                driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        date.sendKeys("02/18/2023");

        Thread.sleep(Duration.ofSeconds(1));

        //choose your profession -> Automation Tester
        WebElement profession =
                driver.findElement(By.xpath("//*[@id=\"profession-1\"]"));
        profession.click();


        Thread.sleep(Duration.ofSeconds(1));

        //choose your tool -> Selenium Webdriver
        WebElement myToolSeleniumWebdriver =
                driver.findElement(By.id("tool-2"));

        myToolSeleniumWebdriver.click();
        myToolSeleniumWebdriver.isSelected();

        Thread.sleep(Duration.ofSeconds(1));

        //choose your continent -> Antartica
        WebElement continent =
                driver.findElement(By.xpath("//*[@id=\"continents\"]/option[7]"));
        continent.click();
        continent.isSelected();

        Thread.sleep(Duration.ofSeconds(1));

        //choose your command  -> Browser Commands
        WebElement browserCommand =
                driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]"));
        browserCommand.click();
        browserCommand.isSelected();

        Thread.sleep(Duration.ofSeconds(2));

        //click submit button
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submit.isSelected();
        submit.click();


        driver.quit();

    }
}
