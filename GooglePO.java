package automatizado.pageObjetct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {
   
   @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(name = "result-stats")
    public WebElement divResultadoPesquisa;



    /**
     * Construtor para a criação da pagina do Google
     * @param driver Driver da pagina do Google
     */
    public GooglePO(WebDriver driver) {
        super(driver);
        
    }
    






}
