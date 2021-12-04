package TestPRO_automation.QC_TestPRO;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class QC_Task_TestPRO {
	
	
	String newuser = "";
	

	WebDriver driver;

	@BeforeTest
	public void OrangeHRM()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		newuser = "kamel99"+ Math.random();

	}
	@Test
	public void test() throws InterruptedException
	{
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		username.sendKeys("Admin");
		System.out.println("1");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys("admin123");
		System.out.println("2");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		login.click();
		System.out.println("3");
		
		WebElement admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		admin.click();
		System.out.println("4");
		
		WebElement user_management = driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		user_management.click();
		System.out.println("5");
		

		WebElement user = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		user.click();
		System.out.println("6");
		
		
		WebElement add_user = driver.findElement(By.xpath("//*[@id=\"btnAdd\"]"));
		add_user.click();
		System.out.println("7");
		WebElement Employee_name = driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]"));
		Employee_name.sendKeys("a");
		System.out.println("8");

		WebElement down_list = driver.findElement(By.cssSelector("body > div.ac_results > ul > li.ac_even.ac_over"));
		down_list.click();
		System.out.println("9");
		
		
		
		WebElement user_name = driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]"));
		user_name.sendKeys(newuser);
		System.out.println("10");
		
		WebElement password_user = driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]"));
		password_user.sendKeys("12345678");
		System.out.println("11");
		
		WebElement password_confirm = driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]"));
		password_confirm.sendKeys("12345678");
		System.out.println("12");
		
		WebElement save_button = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
		save_button.click();
		System.out.println("13");
		
		Thread.sleep(5000);
		WebElement search_textbox = driver.findElement(By.id("searchSystemUser_userName"));
		search_textbox.sendKeys(newuser);
		
		System.out.println("14");
		
		
		
		WebElement search_button = driver.findElement(By.xpath("//*[@id=\"searchBtn\"]"));
		search_button.click();
		System.out.println("15");
		
		
		

		WebElement details_btn = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a"));
		details_btn.click();
		System.out.println("16");
		
		//String expected_Employee_name = "Aaliyah Haq";
		//String expected_Username = newuser;
		
		
		/*WebElement act_employee_name = driver.findElement(By.id("systemUser_employeeName_empName"));
		String k = act_employee_name.getText();
		System.out.println(k);
		assertEquals(k, expected_Employee_name);*/

		WebElement act_user_name = driver.findElement(By.id("systemUser_userName"));
		String m = act_user_name.getText();
		System.out.println(m);
		assertEquals(m, newuser);
		
		
		
	}

}
