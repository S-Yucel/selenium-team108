package day08_explicitlyWait_cookies_webTables;


import org.apache.hc.client5.http.cookie.Cookie;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.util.Date;
import java.util.Set;

public class C04_Cookies extends TestBase {
    @Test
    public void test01(){
        //1- Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //2- tum cookie’leri listeleyin
        Set<org.openqa.selenium.Cookie> cookiesSeti= driver.manage().getCookies();
        int siraNo=1;
        for (org.openqa.selenium.Cookie eachCookie:cookiesSeti
        ) {
            System.out.println(siraNo + "- " + eachCookie.toString());
            siraNo++;
        }
        //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        Assert.assertTrue(((Set<?>) cookiesSeti).size()>5);
        //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        String actualValue= driver.manage().getCookieNamed("i18n-prefs").getValue();
        String expectedValue= "USD";
        Assert.assertEquals(expectedValue,actualValue);
        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun
        //   ve sayfaya ekleyin
        Cookie benimCookie= new Cookie() {
            @Override
            public String getAttribute(String s) {
                return null;
            }

            @Override
            public boolean containsAttribute(String s) {
                return false;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public String getValue() {
                return null;
            }

            @Override
            public Date getExpiryDate() {
                return null;
            }

            @Override
            public boolean isPersistent() {
                return false;
            }

            @Override
            public String getDomain() {
                return null;
            }

            @Override
            public String getPath() {
                return null;
            }

            @Override
            public boolean isSecure() {
                return false;
            }

            @Override
            public boolean isExpired(Date date) {
                return false;
            }

            @Override
            public Date getCreationDate() {
                return null;
            }
        };
        driver.manage().addCookie((org.openqa.selenium.Cookie) benimCookie);
        cookiesSeti= driver.manage().getCookies();
        siraNo=1;
        for (org.openqa.selenium.Cookie eachCookie:cookiesSeti
        ) {
            System.out.println(siraNo + "- " + eachCookie.toString());
            siraNo++;
        }
        //6- eklediginiz cookie’nin sayfaya eklendigini test edin
        actualValue=driver.manage().getCookieNamed("en sevdigim cookie").getValue();
        expectedValue="cikolatali";
        Assert.assertEquals(expectedValue,actualValue);
        //7- ismi skin olan cookie’yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");
        System.out.println("=========");
        // olmayan bir elemani test edemem
        // bunun yerine for-each Loop ile ele aldigimiz her cookie'yi kontrol edelim
        // ismi skin olan varsa test failed olsun
        cookiesSeti= driver.manage().getCookies();
        for (org.openqa.selenium.Cookie eachCookie:cookiesSeti
        ) {
            Assert.assertFalse(eachCookie.getName().equals("skin"));
        }
        //8- tum cookie’leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();
        cookiesSeti= driver.manage().getCookies();
        Assert.assertTrue(cookiesSeti.size()==0);
    }

}
