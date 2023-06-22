import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class parameters {
	WebDriver driver = new ChromeDriver();
    SoftAssert myAssertion = new SoftAssert();
  	
    @BeforeTest
    public void mySetup () {
    	driver.get("https://www.almosafer.com/en");
    }
    
}
