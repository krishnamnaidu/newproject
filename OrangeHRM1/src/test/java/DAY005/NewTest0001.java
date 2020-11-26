package DAY005;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NewTest0001 {
	
	WebDriver driver;
	
  @Test
  public void T1_Skills() throws Exception
 {
	  
	    NewTest0001 T1=new NewTest0001();
	    T1.Openbrowser();
	    T1.login();
	    T1.nagavationadmin();
	    T1.viewskills();
	    
	    
	    
 }
  public void Openbrowser() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
  }
  
  public void login() throws Exception
  {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");  
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	  
  }
  public void nagavationadmin() throws Exception
  {
	  driver.findElement(By.id("menu_admin_viewAdminModule")).click(); 
	  driver.findElement(By.id("menu_admin_Qualifications")).click(); 
	  driver.findElement(By.id("menu_admin_viewSkills")).click();
	 //driver.findElement(By.id("menu_admin_viewEducation")).click();  
	 // driver.findElement(By.id("menu_admin_viewSkills")).click();
	  
  }
  
  
  
  public void viewskills() throws Exception 
  {
	  driver.findElement(By.id("btnAdd")).click();
	  driver.findElement(By.id("skill_name")).sendKeys("project0001");
	  driver.findElement(By.id("skill_description")).sendKeys("project123");
	  driver.findElement(By.id("btnSave")).click();
  }
 
}

