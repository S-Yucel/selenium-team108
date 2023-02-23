package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_DinamikDosyaYolu {
    @Test
    public void test01(){
        //masaustunde theDelte.docx isimli gosya varmi test et
        String dosyaYolu = System.getProperty("user.home"+ "\\Downloads\\TheDelta.docx");

        //Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
        System.out.println(dosyaYolu);
    }

}
