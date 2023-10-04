package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.Loginvtigerpage;

public class test3 {

	WebDriver driver;
	
	@Test
	public void vtiger() throws IOException, InterruptedException {
		
		
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Data.properties.txt");
		
		Properties p = new Properties();
		
		p.load(fis);
	String BROWSER=p.getProperty("browser");
	
	
	if(BROWSER.equals("Chrome")) {
		driver = new ChromeDriver();
	}else if(BROWSER.equals("Firefox")) {
		driver = new FirefoxDriver();
	}else {
		driver = new EdgeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	String	URL=p.getProperty("url");
	String	NAME=p.getProperty("CampaignName");
	String TARGET=p.getProperty("targetaudience");
	String	SPONSOR=p.getProperty("sponsor");
	String SIZE=p.getProperty("targetsize");
	String DATE=p.getProperty("Date");
	String NUMSENT=p.getProperty("numsent");
	String ESC=p.getProperty("expectedsalescount");
	String ERC=p.getProperty("expectedresponsecount");
	String ASC=p.getProperty("actualsalescount");
	String ARC=p.getProperty("actualresponsecount");
	String	DESCRIPTION=p.getProperty("description");
	String BUGETCOST=p.getProperty("budgetcost");
	String EROI=p.getProperty("expectedroi");
	
	
	driver.get(URL);
		
	Loginvtigerpage lvp = new Loginvtigerpage();
	PageFactory.initElements(driver, lvp);
	lvp.getSigninbtn().click();	
	lvp.getThreeline().click();
	Thread.sleep(2000);
	Actions a = new Actions(driver);
	a.moveToElement(lvp.getMarketing()).perform();
	lvp.getCampaigns().click();
	lvp.getAddcampaigns().click();
	lvp.getCampaignsnames().sendKeys(NAME);	
	lvp.getTargetaudiences().sendKeys(TARGET);	
	lvp.getSponsors().sendKeys(SPONSOR);
	lvp.getTargetsizes().sendKeys(SIZE);
	lvp.getDates().sendKeys(DATE);
	lvp.getDates().sendKeys(Keys.ENTER);
	lvp.getNumsents().sendKeys(NUMSENT);	
	lvp.getExpectedsalescounts().sendKeys(ESC);
	lvp.getExpectedresponsecounts().sendKeys(ERC);
	lvp.getActualsalescounts().sendKeys(ASC);
	lvp.getActualresponsecounts().sendKeys(ARC);
	lvp.getDescriptions().sendKeys(DESCRIPTION);
	lvp.getBudgetcosts().sendKeys(BUGETCOST);
	lvp.getExpectedrois().sendKeys(EROI);
	
	}
}
