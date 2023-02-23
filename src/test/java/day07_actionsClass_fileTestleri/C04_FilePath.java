package day07_actionsClass_fileTestleri;

import com.github.javafaker.File;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath {

    @Test
            public void test01(){
        String dosyaYolu = "C:\\Users\\sry\\Downloads\\TheDelta.docx";

        boolean sonuc = Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);
        /*
        Bilgisayarimizda bir dosyanin var oldugunu test etmek
        icin dosya yoluna ihtiyacimiz var.Ancak herkesin bilgisayarindaki
        dosya yollari farkliliklar gosterir.

        herkesin bilgisayarina gore farkli olan kismijavadan bir komut ile
        elde edebiliriz
         */

        System.out.println(System.getProperty("user.home"));
        dosyaYolu = "C:\\Users\\sry\\Downloads\\TheDelta.docx";
        dosyaYolu=System.getProperty("user.home"+ "\\Downloads\\TheDelta.docx");

        //icinde bulundugumuz dosyanin yolu user.dir
        String dosyaYoluText =
                "C:\\Users\\sry\\OneDrive\\wise-quarter\\seleniumTeam108\\src" +
                        "\\test\\java\\day07_actionsClass_fileTestleri\\text";
        System.out.println(dosyaYoluText);
        System.out.println("user.dir"+"");
    }

}
