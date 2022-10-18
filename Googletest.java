package automatizado.test;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import automatizado.pageObjetct.GooglePO;


public class Googletest extends BaseTest {
    private static GooglePO googlePage;
       @BeforeClass 
      public static void prepararTestes(){
        googlePage = new GooglePO(driver);
      }  

    
    @Test
    public void devePesquisarNoGoogle() {
    

     //ARRANGE - PREPARAÇÃO.

    WebElement inputPesquisa = driver.findElement(By.name("q")); {
    inputPesquisa.sendKeys("Teste Selenium"+ Keys.ENTER);
    //AÇÃO
 String resultado = driver.findElement(By.id("result-stats")).getText();
  
    assertTrue(resultado, resultado.contains("Aproximadamente"));
    driver.quit();

}
}
}
   
     

