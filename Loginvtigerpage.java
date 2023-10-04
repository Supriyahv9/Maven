package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginvtigerpage {

	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	
	@FindBy(xpath="(//span[@class='app-icon fa fa-bars'])[1]")
	private WebElement threeline;

	public WebElement getThreeline() {
		return threeline;
	}
	
	@FindBy(xpath="//span[text()=' MARKETING']")
	private WebElement marketing;

	public WebElement getMarketing() {
		return marketing;
	}
	
	@FindBy(xpath="//span[text()=' Campaigns']")
	private WebElement campaigns;

	public WebElement getCampaigns() {
		return campaigns;
	}
	
	@FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addcampaigns;

	public WebElement getAddcampaigns() {
		return addcampaigns;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_campaignname")
	private WebElement campaignsnames;

	public WebElement getCampaignsnames() {
		return campaignsnames;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_targetaudience")
	private WebElement targetaudiences;

	public WebElement getTargetaudiences() {
		return targetaudiences;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_sponsor")
	private WebElement sponsors;

	public WebElement getSponsors() {
		return sponsors;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_targetsize")
	private WebElement targetsizes;

	public WebElement getTargetsizes() {
		return targetsizes;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_closingdate")
	private WebElement dates;

	public WebElement getDates() {
		return dates;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_numsent")
	private WebElement numsents;

	public WebElement getNumsents() {
		return numsents;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_expectedsalescount")
	private WebElement expectedsalescounts;

	public WebElement getExpectedsalescounts() {
		return expectedsalescounts;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_expectedresponsecount")
	private WebElement expectedresponsecounts;

	public WebElement getExpectedresponsecounts() {
		return expectedresponsecounts;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_actualsalescount")
	private WebElement actualsalescounts;

	public WebElement getActualsalescounts() {
		return actualsalescounts;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_actualresponsecount")
	private WebElement actualresponsecounts;

	public WebElement getActualresponsecounts() {
		return actualresponsecounts;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_description")
	private WebElement descriptions;

	public WebElement getDescriptions() {
		return descriptions;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_budgetcost")
	private WebElement budgetcosts;

	public WebElement getBudgetcosts() {
		return budgetcosts;
	}
	
	@FindBy(id="Campaigns_editView_fieldName_expectedroi")
	private WebElement expectedrois;

	public WebElement getExpectedrois() {
		return expectedrois;
	}
}
