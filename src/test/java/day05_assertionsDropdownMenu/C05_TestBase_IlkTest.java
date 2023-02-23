package day05_assertionsDropdownMenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C05_TestBase_IlkTest extends TestBase {

    @Test
    public void amazonTest(){
        // amazona gidelim
        driver.get("https://www.amazon.com");

        // Nutella aratalim
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Nutella" + Keys.ENTER);

        //sonuclarin Nutella icerdigini test edelim
        WebElement actualSonucYazisiElementi = driver.findElement(By.xpath
                ("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));

        String expectedIcerik = "Nutella";
        String actualSonucYazisi = actualSonucYazisiElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }



}
