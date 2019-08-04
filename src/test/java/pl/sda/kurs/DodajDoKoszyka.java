package pl.sda.kurs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DodajDoKoszyka {
    ChromeDriver przegladarka;


    @Before
    public void przygotujPrzegladarke(){
        System.setProperty("webdriver.chrome.driver", "E:\\Tomek\\praca - Tomek\\skolenie tester oprogramowania/chromedriver.exe");
        przegladarka = new ChromeDriver();
    }
    @After
    public void zamknijPrzegladarke(){
    przegladarka.quit();
    }

    @Test
    public void ilośćRówna1(){
        przegladarka.get("https://www.ocado.com/browse");
        List<WebElement> produkty = przegladarka.findElements(By.cssSelector(".fops-item"));

        przegladarka.findElement(By.cssSelector(".cd-cookieDisclaimer__close")).click();
        WebDriverWait czekaj = new WebDriverWait(przegladarka,10);

        czekaj.until(ExpectedConditions.elementToBeClickable(produkty.get(3).findElement(By.cssSelector(".fop-btn-add"))));

        produkty.get(3).findElement(By.cssSelector(".fop-btn-add")).click();



    }


}
