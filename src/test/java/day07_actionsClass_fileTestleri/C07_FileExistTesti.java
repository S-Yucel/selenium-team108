package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C07_FileExistTesti extends TestBase {
    @Test
    public void test01(){
        //calistigimiz dosya icinde
        //text.txt isimli bir file oldugunu test edin

        String dinamikDosyaYolu =
                System.getProperty("user.dir")+"/src/test/java/day07_actionsClass_fileTestleri/text";
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
    }
}
