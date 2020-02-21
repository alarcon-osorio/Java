package <<nameproject>>;
import org.openqa.selenium.WebDriver;
//Esta linea es para importar Firefox a Selenium
//import org.openqa.selenium.firefox.FirefoxDriver;
//Esta linea es para importar Chrome a Selenium
import org.openqa.selenium.chrome.ChromeDriver;

public class <<nameMyClass>> {
    public static void main(String[] args) {
    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      //In my Case
      //System.setProperty("webdriver.chrome.driver","C:\\Users\\jalarcon\\Documents\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
    	//WebDriver driver = new ChromeDriver();
   
        String baseUrl = "http://www.facebook.com"; //url a capturar
        String tagName = ""; 
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();  //devolvera un input o id del form
        System.out.println(tagName);
        driver.close();
        System.exit(0);
}
}

/*

By.className	-- finds elements based on the value of the "class" attribute	findElement(By.className("someClassName"))
By.cssSelector	-- finds elements based on the driver's underlying CSS Selector engine	findElement(By.cssSelector("input#email"))
By.id	-- locates elements by the value of their "id" attribute	findElement(By.id("someId"))  
By.linkText	 -- finds a link element by the exact text it displays	findElement(By.linkText("REGISTRATION"))  
By.name	 -- locates elements by the value of the "name" attribute	findElement(By.name("someName"))  
By.partialLinkText --	locates elements that contain the given link text	findElement(By.partialLinkText("REG"))  
By.tagName	-- locates elements by their tag name	findElement(By.tagName("div"))  
By.xpath	-- locates elements via XPath	findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/ tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/ form/table/tbody/tr[5]"))

*/
