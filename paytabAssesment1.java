////////////////////////////////////////////////////////////////////////////////////////////////////////////////////Task 1 Script///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.Assert;
import org.testng.annotations.test
import java.io.*;
import java.lang.Thread; 

@Test
Public class paytabsAssesment1{
								public void To verify login with valid username and valid password() 
								{ 
								String driverpath = “ D:\\ChromeDriver\\chromedriver.exe”;
								System.setProperty("webdriver.chrome.driver", driverpath );   

										  WebDriver driver=new ChromeDriver();  
										  driver.manage().window().maximize();  
									   String url=”https://opensource-demo.orangehrmlive.com/web/index.php/auth/login”;
										  driver.get(url);
								WebElement username=driver.findElement(By.name("username")); WebElement password=driver.findElement(By.name("password"));     WebElement ogin=driver.findElement(By.xpath(//*[@type="submit"])); username.sendKeys("Admin");
								password.sendKeys("admin123"); login.click(); driver.switchTo().alert().accept();
								}

								@Test

								public void To verify user can click the admin menu and add button () {

								WebElement admin=driver.findElement(By.class("oxd-text oxd-text--span oxd-main-menu-item-- name"));
								admin.click();

								WebElement add=driver.findElement(By.xpath(“//button[@type=’button’]”));
								add.click();

								}

								@Test

								public void To verify user able to select value from dropdown in user role field () 
								{
								 Select drpRole = new Select(driver.findElement(By.xpath("//*[text()=' -- Select –‘]"))); drpRole.selectByVisibleText("Admin");
								}

								@Test

								public void To verify user able to enter username in username field () { 
								WebElement name=driver.findElement(By.class("oxd-input oxd-input--active")); name.sendKeys("hitu");

								String errormsg=driver.findElement(By.class("oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group message")).getText();

								System.out.println(errormsg);
								name.clear();
								name.sendKeys("hitesh");

								}

								@Test

								public void To verify user able to select value from dropdown in status field()
								{

								Select drpStatus = new Select(driver.findElement(By.class(“oxd-select-text-input”))); drpStatus.selectByVisibleText("Enabled");
								}

								@Test

								public void To verify user able to enter employee name in employee field ()
								{

								WebElement Emp=driver.findElement(By.xpath(//*[@placeholder="Type for hints..."]));
								Emp.sendKeys("Dominic Chase");

								}

								@Test

								public void To verify user able to enter password in password field (){ WebElement password=driver.findElement(By.name("password")); password.sendKeys("Pass");
								String errormessage=driver.findElement(By.class("oxd-text oxd-text--span oxd-input-field-error- message oxd-input-group message")).getText();

								System.out.println(errormessage); 
								password.clear();
								password.sendKeys("Pass@123");
								}

								@Test

								public void To verify user able to enter password in confirm password field(){

								WebElement confirm=driver.findElement(By.class("oxd-input oxd-input--active oxd-input--error ")); confirm.sendKeys("Pass");


								String message=driver.findElement(By.class("oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group message")).getText();
								System.out.println(message); 
								confirm.clear();
								confirm.sendKeys("Pass@123");
								}

								@Test

								public void To verify new user was saved ()
								{

								driver.findElement(By.class(“oxd-select-text-input”)).click();

								}

								@Test

								public void To verify the user was logged out ()
								{

								Select logout= new Select(driver.findElement(By.class(“oxd-userdropdown-name”))); logout.selectByVisibleText("Logout");
								}

								@Test

								public void To verify login with valid username and invalid password (){ WebElement username=driver.findElement(By.name("username")); 
								WebElement password=driver.findElement(By.name("password")); 
								WebElement login=driver.findElement(By.xpath(//*[@type="submit"])); username.sendKeys("hitesh"); 
								password.sendKeys("Pass@123");
								login.click();


								}


								@Test

								public void To Verify user able to click my info menu and able to view fields under Personal Details Tab()
								{

								WebElement info=driver.findElement(By.class(“oxd-text oxd-text--span oxd-main-menu-item-- name”));
								info.click();

								}

								@Test

								public void To verify user able to capture the employee full name()
								{
								 String first=driver.findElement(By.name("firstName")).getText(); System.out.println(first);
								String last=driver.findElement(By.name("lastName")).getText(); System.out.println(last);
								}

								@Test

								public void To verify user able to capture the employee ID and verify able to edit that field(){ String EmpID=driver.findElement(By.class("oxd-input oxd-input--active ")).getText(); System.out.println(EmpID);
								}
								@Test

								public void To verify user able to capture the date of birth ()
								{

								WebElement dateofbirth=driver.findElement(By.xpath(//*[@placeholder=“yyyy-mm-dd”]));
								dateofbirth.click(); 
								Select dropped= new Select(driver.findElement(By.class(“oxd-input oxd-input--active”))); dropped.selectByVisibleText("September");
								Select yeardropped= new Select(driver.findElement(By.class(“oxd-input oxd-input”)));

								yeardropped.selectByVisibleText("1997"); String date =”27”;
								List<WebElement> alldate= driver.findElements(By.xpath("//div[@class='oxd-input']/span[1]")); for(WebElement dates:alldate){
								String element = dates.getText(); If(element.equals(date)){ dates.click();
								break;

								}
								}

								@Test

								public void To verify user able to check the gender is selected or not ()
								{

								WebElement gender=driver.findElement(By.class(“oxd-radio-input oxd-radio-input--active --label- right oxd-radio-input”));

								System.out.println(gender.isSelected());

								}

								@Test

								public void To verify user able to select value from dropdown in nationality field ()
								{ 
								Select nationality= new Select(driver.findElement(By.class(“oxd-select-text-input”))); nationality.selectByVisibleText("Indian");
								}
								@Test

								public void To verify user able to select value from dropdown in martial status field ()
								{

								Select martial= new Select(driver.findElement(By.class(“oxd-select-text oxd-select-text--active”))); martial.selectByVisibleText("Single");
								}

								@Test

								public void To verify user able to enter driver's license number in the field(){

								WebElement driverno=driver.findElement(By.class("oxd-input oxd-input--active oxd-input--error ")); driverno.sendKeys("eaejafhu32ridu9uri2dnm4qbrjadjcguertjafhiefhjhgdjabdjedkwr");
								String mge=driver.findElement(By.class("oxd-text oxd-text--span oxd-input-field-error-message oxd- input-group message")).getText();

								System.out.println(mge); driverno.sendKeys("D0Nq78s");
								}

								@Test

								public void To verify user able to enter license expiry date in the field (){

								String expiry=driver.findElement(By.xpath(//*[placeholder="yyyy-mm-dd"])).getText();


								System.out.println(expiry);

								WebElement expirydate=driver.findElement(By.xpath(//*[placeholder="yyyy-mm-dd"])).click(); Select dropped= new Select(driver.findElement(By.class(“oxd-input oxd-input--active”))); dropped.selectByVisibleText("October");
								Select yeardropped= new Select(driver.findElement(By.class(“oxd-input oxd-input”)));

								yeardropped.selectByVisibleText("2022"); String date =”15”;
								List<WebElement> alldate= driver.findElements(By.xpath("//div[@class='oxd-input']/span[1]")); for(WebElement dates:alldate){
								String element = dates.getText();
								If(element.equals(date)){ dates.click();
								break;

								}
								}


								@Test

								public void To verify user able to enter nice name in nice name field ()
								{

								WebElement nick=driver.findElement(By.class("oxd-input oxd-input--active oxd-input--error ")); nick.sendKeys("rajacholsebfjaebfjkweufhdlkjsdnasjncdwufhjascsdjfhlafsakrhfkreanfc");
								String mges=driver.findElement(By.class("oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group message")).getText();

								System.out.println(mges); nick.sendKeys("hitu");
								}


								@Test

								public void To verify user able to click smoker radio button()
								{

								WebElement smoker=driver.findElement(By.class("oxd-icon bi-check oxd-checkbox-input-icon")); Smoker.click();
								}

								@Test

								public void To verify user able to enter SIN number in SIN number field()
								{

								WebElement SIN=driver.findElement(By.class("oxd-input oxd-input--active oxd-input--error ")); SIN.sendKeys("869163982918234948494972992340928940394871673920393");
								String messgs=driver.findElement(By.class("oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group message")).getText();

								System.out.println(messgs); SIN.sendKeys("12345678");
								}
								@Test

								public void To verify user able to enter SSN number in SSN number field()
								{

								WebElement SSN=driver.findElement(By.class("oxd-input oxd-input--active oxd-input--error ")); SSN.sendKeys("869163982918234948494972992340928940394871673920393");
								String mssgs=driver.findElement(By.class("oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group message")).getText();

								System.out.println(mssgs); SSN.sendKeys("87654321");
								}

								@Test

								public void To verify user able to enter military service in military service field()
								{

								WebElement military=driver.findElement(By.class("oxd-input oxd-input--active oxd-input--error ")); military.sendKeys("dhonivirat918234948494972992340928940394871673920393");
								String mssgs=driver.findElement(By.class("oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group message")).getText();

								System.out.println(mssgs); military.sendKeys("exservice");
								}

								@Test

								public void To verify user able to save the info()
								{ 
								WebElement saves=driver.findElement(By.id("submit")); saves.click();
								}

								@Test

								public void To verify user able to select value from dropdown in blood type field()
								{ 
								Select blood= new Select(driver.findElement(By.class(“oxd-select-text-input”))); blood.selectByVisibleText("A+");
								}

								@Test

								public void To verify user able to save the blood type()
								{

								WebElement save=driver.findElement(By.xpath(//*[type="submit"])); save.click();
								}

								@Test

								public void To verify user able to click attach button in add attachment field and upload the resume ()
								{

								WebElement attachment=driver.findElement(By.class("oxd-icon bi-plus oxd-button-icon")); attachment.sendKeys(“location of the file”);
								Thread.sleep(3000);

								}

								public void To verify user able to click save button(){

								WebElement saver=driver.findElement(By.xpath(//*[type="submit"])); saver.click();
								}

}

