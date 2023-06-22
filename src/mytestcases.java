import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class mytestcases extends parameters {
		
// 	   @Test(invocationCount=3)
//	   public void checkTheWebSiteLanguage() {
//	   String[] mywebsitelanguage = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
//	   Random rand = new Random();
//	   طريقة الاولى اسهل فقط اطبع بين 0و2
//	   System.out.println(rand.nextInt(0,2));
//	   طريقة الثانية فيها مود ادفانس اكتر 
//	   اي رقم مش شرط 10
//     int RandomNumber = rand.nextInt(0,10)%2;
//     driver.get(mywebsitelanguage[RandomNumber]);
//     هاد الي فوق بتشعبط ع الويب سايت لسا ماعملت تيست الي تحت تيست
//     String ActualTitle = driver.getTitle();
//     if(RandomNumber==1) {
//     myAssertion.assertEquals(ActualTitle,"المسافر: رحلات، فنادق، أنشطة ممتعة و تذاكر طيران");
//     }else
//     myAssertion.assertEquals(ActualTitle,"Almosafer: Flights, Hotels, Activities & Airlines Ticket Booking");
//     myAssertion.assertAll(); }}
	
	
//	 @Test()	  
//	 public void default_Currency_is_correct_SAR() {
//	 String expecteddefaultCurrency ="SAR";
//	 WebElement CurrencyInWebSite= driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
//	 String Actualcurrency = CurrencyInWebSite.getText();
//	 myAssertion.assertEquals(Actualcurrency,expecteddefaultCurrency);
//	 myAssertion.assertAll();}}

	
//    @Test()
//    public void test_qitaf_logo() {
//   	 
//    WebElement divContainsQitafLogo = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[2]"));
//    List<WebElement>mydiv= divContainsQitafLogo.findElements(By.tagName("svg"));
//    String ExpectedQitafID = "Footer__QitafLogo";
//    String ActualqitafID = mydiv.get(0).getAttribute("data-testid");
//    myAssertion.assertEquals(ActualqitafID,ExpectedQitafID);
//    myAssertion.assertAll();}}
	
   
//     @Test()
//      public void subhitest0() {
//      WebElement qitaf= driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[2]"));
//      qitaf.isDisplayed();
//      myAssertion.assertEquals( qitaf.isDisplayed(), true);
//	    myAssertion.assertAll();}}

//      @Test()
//      public void subhitest() {
//      WebElement qitaf= driver.findElement(By.cssSelector("[data-testid=\"Footer__QitafLogo\"]"));
//      WebElement qitaf=driver.findElement(By.cssSelector("svg"));
//      qitaf.isDisplayed();
//      myAssertion.assertEquals(qitaf.isDisplayed(),true);
//	    myAssertion.assertAll();
       
//      }}

//     @Test()
//     public void mytest2() {
//     WebElement a = driver.findElement(By.xpath("//div[@class='sc-fihHvN eYrDjb']//*[name()='svg']"));
//     a.isDisplayed();
//     myAssertion.assertEquals(a.isDisplayed(),true,"this is to test");
//     myAssertion.assertAll();         
//     }}


//	   @Test()
//	   public void Checkvisa() {
//	   WebElement visa =driver.findElement(By.xpath("(//*[name()='svg'][@class='sc-bdVaJa bNehGJ visa-icon'])[1]"));
//	   visa.isDisplayed();
//	   myAssertion.assertEquals(visa.isDisplayed(),true);
//	   myAssertion.assertAll();}}


//      static
//      @Test()
//      public void myTest() {
// 	    int myarrayOne[]=new int[10];
//	   
//	    for(int i=0 ;i<myarrayOne.length;i++) {
//		  myarrayOne[i]=3;
//		  System.out.println(myarrayOne[i]);}}

    

//      dynamic
//      @Test()
//      public void myTest2() {
//	    int arrayTwo[] = {0,1,2,3,4};
//	    System.out.println(arrayTwo[0]);}}
	
	
	
//	     array list
//	     @Test()
//	     public void myTestThree() {}
//       List<Integer> myListThree = new ArrayList<Integer>();
//       myListThree.add(100);
//       System.out.println(myListThree.get(0));
//      
//       List<WebElement>myListFour=driver.findElements(By.tagName("img"));
//       for( int i=0; i<myListFour.size();i++){
//       String h = myListFour.get(i).getAttribute("src");
//       System.out.println(h+(i+1));}}
		 

//	     @Test()
//	      public void test() {
//          List<WebElement> H = driver.findElements(By.tagName("a"));
//          System.out.println(H.size());
//		}}

//	    @Test()
//	    public void hotel_tab_is_not_selected(){
//	    WebElement HotalTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//	    String expectedValue="false";
//	    String ActualValue= HotalTab.getAttribute("aria-selected");
//	    myAssertion.assertEquals(ActualValue,expectedValue,"huda");
//	    myAssertion.assertAll();}}
    
		 
		 
//	     @Test()
//	     public void location_field() {
//	 
//		 String[] mywebsitelanguage = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
//		 String[] EnglishCities= {"Dubai","Jeddah","Riyadh"};
//		 String[] ArabicCities= {"دبي","جدة"};
//		 
//	     Random rand = new Random();
//	     
//	     int RandomNumberWebSite = rand.nextInt(2);
//	     int RandomArabic = rand.nextInt(2);
//	     int RandomEnglish= rand.nextInt(3);
//	     
//	     driver.get(myWebsitelanguage[RandomNumberWebSite]);
//	     
//	     if(RandomNumberWebSite==0) {
//	    	driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(EnglishCities[RandomEnglish]);
//	     }
//	     else {
//	    	driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(ArabicCities[RandomArabic]);
//	    }}
	
	
//	   @Test(invocationCount=3)
//	   public void Randomly_select_number_of_visitor() {
	
//	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
//	   Random  myRandom= new Random();
//	   int H = myRandom.nextInt(2);
//	   driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click();	 
//     WebElement roomSelection = driver.findElement(By.xpath("//select[@class='tln3e3-1 eFsRGb']")); 
//	   Select mySelect = new Select(roomSelection);
//	   mySelect.selectByIndex(H);
//	   System.out.println(roomSelection.getText());}}
	
	@Test()
	public void randomly () {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Random rand= new Random();
		int h =rand.nextInt(2);
		driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click();
		WebElement room = driver.findElement(By.xpath("//select[@class='tln3e3-1 eFsRGb']"));
		Select my = new Select(room);
		my.selectByIndex(h);
		System.out.println(room.getText());
	}}
	
	
	
	
	
	
	


//     @AfterTest
//     public void closeTheBrowser() {
// 	   driver.close();}}
