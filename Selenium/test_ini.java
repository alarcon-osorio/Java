package newproject;
import org.openqa.selenium.WebDriver;
//Esta linea es para importar Firefox a Selenium
//import org.openqa.selenium.firefox.FirefoxDriver;
//Esta linea es para importar Chrome a Selenium
import org.openqa.selenium.chrome.ChromeDriver;
public class MyClass {


    public static void main(String[] args) {
    //declaration and instantiation of objects/variables
    //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//Para usar con Chrome
		System.setProperty("webdriver.chrome.driver","C:\\<<ruta del arechico CHROME DRIVER>>");
    //In my case
    //System.setProperty("webdriver.chrome.driver","C:\\Users\\jalarcon\\Documents\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/"; //pagina para test
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");  // en console debe aprecer esto si todo sale bien
        } else {
            System.out.println("Test Failed");
        }
       
        //close Chrome
        driver.close();
       
    }

}
