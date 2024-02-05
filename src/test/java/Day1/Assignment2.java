package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	  public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.epfindia.gov.in/site_en/index.php");
		  
		  driver.findElement(By.xpath("//img[@alt='EPFO'and @title='EPFO']"));
		  driver.findElement(By.xpath("//img[@src='../images/EPFO_Logo.png']"));
		  driver.findElement(By.xpath("//img[@width='100' and @height='100' and @alt='EPFO' and @title='EPFO']"));
		  driver.findElement(By.xpath("//a[@title='Our Services']"));
		  driver.findElement(By.xpath("//li[@class='menu__item is-leaf leaf menu-mlid-1505          ']"));
		  driver.findElement(By.xpath("//a[@title='Establishments' and @class='menu__link']"));
		  driver.findElement(By.xpath("//a[contains(@title,'EPFO Corner')]"));
		  driver.findElements(By.xpath("//li[@class='menu__item is-expanded expanded menu-mlid-944                         ']"));
		  driver.findElement(By.xpath("//a[@class='menu__link' and @alt='Directory']"));
		  driver.findElement(By.xpath("//a[@title='Payroll Data' and @target='_blank']"));
		  driver.findElement(By.xpath("//a[@href='#' and @id='increase_font']"));
		  driver.findElement(By.xpath("//img[@alt='Hindi Site' and @id='hindi_logo_1']"));
		  driver.findElement(By.xpath("//img[@alt='National Emblem']"));
		  driver.findElement(By.xpath("//span[@id='epfo']"));
		  driver.findElement(By.xpath("//img[contains(@alt,'G20')]"));
		  driver.findElement(By.xpath("//img[@title='Azadi Ka Amrit Mahotsav, Ministry of Culture, Government of India']"));
		  driver.findElement(By.xpath("(//img[@title='Congratulations to New Recruits - SSAs'])[1]"));
		  driver.findElement(By.xpath("(//img[@class='img-rounded'])[1]"));
		  driver.findElement(By.xpath("//a[text()='Establishment e-Report Card']"));
		  driver.findElement(By.xpath("//a[contains(text(),'Principal Employers-CAIU Portal')]"));
		  driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[1]"));
		  driver.findElement(By.xpath("//a[contains(text(),'Jeevan Pramaan Through Mobile App')]"));
		  driver.findElement(By.xpath("//a[text()='TRRN Query Search']"));
		  driver.findElement(By.xpath("(//div[@class='imp_butn'])[1]"));
		  driver.findElement(By.xpath("//div[@style='line-height: 25px; margin-left:10px']"));
		  driver.findElement(By.xpath("//div[contains(text(),'mGovernance')]"));
		  driver.findElement(By.xpath("(//div[@style='line-height: 43px; margin-left:10px'])[1]"));
		  driver.findElement(By.xpath("//div[contains(text(),'Photo Gallery')]"));
		  driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[1]"));
		  driver.findElement(By.xpath("//img[@alt='ISSA']"));
		  driver.findElement(By.xpath("//span[@style='margin-left:60px;']"));
		  driver.findElement(By.xpath("//p[contains(text(),'Know Your Balance')]"));
		  driver.findElement(By.xpath("//img[@title='EPFO CHATBOT']"));
		  driver.findElement(By.xpath("//a[contains(text(),'EPFO Schemes')]"));
		  driver.findElement(By.xpath("(//b[@style='color:blue'])[1]"));
		  driver.findElement(By.xpath("//a[contains(text(),'Vision & Mission')]"));
		  driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
		  driver.findElement(By.xpath("//span[@id='copyrt' and @style='margin-left:60px;']"));
		  driver.findElement(By.xpath("(//img [@class='img-rounded'])[1]"));
		  driver.findElement(By.xpath("//img [@class='img-rounded' and  @alt='e-Passbook']"));
		  driver.findElement(By.xpath("//img [@class='img-rounded' and  @alt='Online Claims Member Account Transfer']"));
		  driver.findElement(By.xpath("//img[@id='kyc_panel_1']"));
		  driver.findElement(By.xpath("//li[contains(text(),'EPFO launches Mobile Application for Employers, Employees and Pensioners')]"));
		  driver.findElement(By.xpath("//a[@title='Downloads'and @href='#']"));
		  driver.findElement(By.xpath("(//a[@title='covid19'])[1]"));
		  driver.findElement(By.xpath("//a[@title='Dashboard' and @alt='Dashboards']"));
		  driver.findElement(By.xpath("//a[contains(text(),'नराकास')]"));
		  driver.findElement(By.xpath("//a[text()='International Workers Portal']"));
		  driver.findElement(By.xpath("(//li[@class='menu__item is-leaf leaf menu-mlid-1505    '])[1]"));
		  driver.findElement(By.xpath("//img[@id='voters_logo_1' and @alt]"));
		  driver.findElement(By.xpath("//img[@alt='India code' and @id='indiacode_logo_1']"));
		  driver.findElement(By.xpath("//div[@id='footer_link' and @class='img_col']"));
		  driver.findElement(By.xpath("//img[@alt='Help Desk/TollFree Number is operational 24x7']"));
		  driver.findElement(By.xpath("//a[@alt='Payroll Data' and @target='_blank']"));
		  driver.findElement(By.xpath("//a[text()='Screen Reader Access']"));
		  driver.findElement(By.xpath("//a[contains(text(),'Skip to main content')]"));
		  driver.findElement(By.xpath("//a[contains(text(),'Ease of Doing Business')]"));
		  driver.findElement(By.xpath("//a[@title='covid19' and @alt='ABRY']"));
		  driver.findElement(By.xpath("//img[@id='help_logo_1' and @class='img_icon']"));
		  driver.findElement(By.xpath("//img[@title='Subscribe on Youtube (External Non-Government website)']"));
		  driver.findElement(By.xpath("//a[text()=' Independent India @ 75: Self Reliance with Integrity']"));
		  driver.findElement(By.xpath("//img[@style=' height :20px; width :20px; padding-top: 3px' and @title='Home']"));
		  driver.findElement(By.xpath("//a[contains(text(),'FUNDAMENTAL DUTIES OF THE CITIZENS OF INDIA')]"));
	      driver.findElement(By.xpath("//img[@id='claim_panel_1' and @class='img-rounded' and @alt='Online Claims Member Account Transfer']"));
          driver.findElement(By.xpath("(//a[@target='_blank' and @class='menu__link'])[1]"));
          driver.findElement(By.xpath("//a[contains(text(),'Whistle Blower Policy - CVC')]"));
          driver.findElement(By.xpath("//img[@title='Jeevan Pramaan' and @alt='Jeevan_Pramaan' and @draggable='false']"));
          driver.findElement(By.xpath("//img[@title='e-Nomination' and @class='img-rounded' and @alt='e-Nomination']"));
          driver.findElement(By.xpath("(//img[@alt='Azadi Ka Amrit Mahotsav'])[1]"));
          driver.findElement(By.xpath("//a[contains(text(),'State Profile Booklet')]"));
          driver.findElement(By.xpath("//a[contains(text(),'Videos')]"));
          
          
          
          
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  	
		  
		  
		  
		  
		  
	}
	
	
}
