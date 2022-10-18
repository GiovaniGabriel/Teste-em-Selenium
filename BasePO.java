package automatizado.pageObjetct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


/* 
 * CLASSE BASE PARA CRIAÇÃO DAS NOVAS PAGESOBJECTS
 * TODAS AS PAGES DEVEM SER HERDADAS DESSA CLASSE.
*/
public abstract class BasePO {
    
/*
 *Driver Base que sera usado pelas pages 
 */
protected WebDriver driver;

/**
 * Construtor base para criação da fabrica de elementos.(PAGEFACTORY)
 * @param driver Driver da página atual.
*/
protected BasePO(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
} 
}
