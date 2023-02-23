package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05_Odev3 {
    public static void main(String[] args) throws InterruptedException {
        // .......Exercise5........

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navigate to website https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        //Under the ORIGINAL CONTENTS
        //click on Alerts
        WebElement originalContents = driver.findElement(By.xpath("/html/body/div/h2[4]"));

        WebElement alert = driver.findElement(By.id("alert"));
        alert.click();

        Thread.sleep(Duration.ofMillis(3000));

        //print the URL
        WebElement alertUrl = driver.findElement(By.xpath("/html/head/script"));
        System.out.println(alertUrl.getText());

        //navigate back
        driver.navigate().back();

        //print the URL
        System.out.println(originalContents.getText());

        //Click on Basic Ajax

        WebElement basicAjax = driver.findElement(By.id("basicajax"));
        basicAjax.click();

        //print the URL
        String basicAjaxUrl = driver.getCurrentUrl();
        System.out.println(basicAjaxUrl);


        //enter value 20 and ENTER
        WebElement value = driver.findElement(By.id("lteq30"));
        value.sendKeys("20");
        //value.submit();

        WebElement submitButton = driver.findElement(By.xpath("/html/body/form/input[1]"));
        submitButton.click();

        //and then verify Submitted Values is displayed open page
        WebElement submittedValues = driver.findElement(By.xpath("/html"));
        submittedValues.isDisplayed();
        Thread.sleep(Duration.ofSeconds(2));

        //close driver
        driver.quit();

    }

}
