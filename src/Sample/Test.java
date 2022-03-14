package Sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowri\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		System.out.println("Line added using GIT");
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("sakthiraj");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("aruchamy");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(1);		
		WebElement hotels = driver.findElement(By.id("hotels"));
		hotels.sendKeys("Hotel Creek");		
		WebElement room = driver.findElement(By.id("room_type"));
		room.sendKeys("Standard");		
		WebElement roomNumber = driver.findElement(By.id("room_nos"));
		roomNumber.sendKeys("2 - Two");		
		WebElement adult = driver.findElement(By.id("adult_room"));
		adult.sendKeys("2 - Two");		
		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();
		
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		btnRadio.click();
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("Gowri");
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("Hari");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Velachery");
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys("1234567890123456");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		ccType.sendKeys("American Express");
		WebElement ccExpMonth = driver.findElement(By.id("cc_exp_month"));
		ccExpMonth.sendKeys("January");
		WebElement ccExpYear = driver.findElement(By.id("cc_exp_year"));
		ccExpYear.sendKeys("2022");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("1234");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
		Thread.sleep(5000);
		
		WebElement orderNo = driver.findElement(By.id("order_no"));
		System.out.println(orderNo.getAttribute("value"));
		
		System.out.println("*************************");
		
		WebElement search = driver.findElement(By.id("search_hotel"));
		search.click();
		
		Thread.sleep(3000);
		
		WebElement location1 = driver.findElement(By.id("location"));
		Select s1 = new Select(location1);
		s1.selectByIndex(2);		
		WebElement hotels1 = driver.findElement(By.id("hotels"));
		hotels1.sendKeys("Hotel Sunshine");		
		WebElement room1 = driver.findElement(By.id("room_type"));
		room1.sendKeys("Double");		
		WebElement roomNumber1 = driver.findElement(By.id("room_nos"));
		roomNumber1.sendKeys("3 - Three");		
		WebElement adult1 = driver.findElement(By.id("adult_room"));
		adult1.sendKeys("3 - Three");		
		WebElement btnSubmit1 = driver.findElement(By.id("Submit"));
		btnSubmit1.click();
		
		WebElement btnRadio1 = driver.findElement(By.id("radiobutton_0"));
		btnRadio1.click();
		WebElement cont1 = driver.findElement(By.id("continue"));
		cont1.click();
		
		WebElement firstName1 = driver.findElement(By.id("first_name"));
		firstName1.sendKeys("Hari");
		WebElement lastName1 = driver.findElement(By.id("last_name"));
		lastName1.sendKeys("Rangan");
		WebElement address1 = driver.findElement(By.id("address"));
		address1.sendKeys("Velachery");
		WebElement ccNum1 = driver.findElement(By.id("cc_num"));
		ccNum1.sendKeys("1234567890123456");
		WebElement ccType1 = driver.findElement(By.id("cc_type"));
		ccType1.sendKeys("VISA");
		WebElement ccExpMonth1 = driver.findElement(By.id("cc_exp_month"));
		ccExpMonth1.sendKeys("February");
		WebElement ccExpYear1 = driver.findElement(By.id("cc_exp_year"));
		ccExpYear1.sendKeys("2022");
		WebElement cvv1 = driver.findElement(By.id("cc_cvv"));
		cvv1.sendKeys("1234");
		WebElement book1 = driver.findElement(By.id("book_now"));
		book1.click();
		
		Thread.sleep(5000);
		
		WebElement orderNo1 = driver.findElement(By.id("order_no"));
		System.out.println(orderNo1.getAttribute("value"));

		WebElement search1 = driver.findElement(By.id("search_hotel"));
		search1.click();
		
		Thread.sleep(3000);
		
		WebElement location2 = driver.findElement(By.id("location"));
		location2.sendKeys("Adelaide");	
		WebElement hotels2 = driver.findElement(By.id("hotels"));
		hotels2.sendKeys("Hotel Hervey");		
		WebElement room2 = driver.findElement(By.id("room_type"));
		room2.sendKeys("Deluxe");		
		WebElement roomNumber2 = driver.findElement(By.id("room_nos"));
		roomNumber2.sendKeys("4 - Four");		
		WebElement adult2 = driver.findElement(By.id("adult_room"));
		adult2.sendKeys("4 - Four");		
		WebElement btnSubmit2 = driver.findElement(By.id("Submit"));
		btnSubmit2.click();
		
		WebElement btnRadio2 = driver.findElement(By.id("radiobutton_0"));
		btnRadio2.click();
		WebElement cont2 = driver.findElement(By.id("continue"));
		cont2.click();
		
		WebElement firstName2 = driver.findElement(By.id("first_name"));
		firstName2.sendKeys("Kaushik");
		WebElement lastName2 = driver.findElement(By.id("last_name"));
		lastName2.sendKeys("Sathyanarayanan");
		WebElement address2 = driver.findElement(By.id("address"));
		address2.sendKeys("Neelankari");
		WebElement ccNum2 = driver.findElement(By.id("cc_num"));
		ccNum2.sendKeys("1234567890123456");
		WebElement ccType2 = driver.findElement(By.id("cc_type"));
		ccType2.sendKeys("Master Card");
		WebElement ccExpMonth2 = driver.findElement(By.id("cc_exp_month"));
		ccExpMonth2.sendKeys("March");
		WebElement ccExpYear2 = driver.findElement(By.id("cc_exp_year"));
		ccExpYear2.sendKeys("2022");
		WebElement cvv2 = driver.findElement(By.id("cc_cvv"));
		cvv2.sendKeys("1234");
		WebElement book2 = driver.findElement(By.id("book_now"));
		book2.click();
		
		Thread.sleep(5000);
		
		WebElement orderNo2 = driver.findElement(By.id("order_no"));
		System.out.println(orderNo2.getAttribute("value"));
		
		WebElement search2 = driver.findElement(By.id("search_hotel"));
		search2.click();
		
		Thread.sleep(3000);
		
		WebElement location3 = driver.findElement(By.id("location"));
		location3.sendKeys("London");	
		WebElement hotels3 = driver.findElement(By.id("hotels"));
		hotels3.sendKeys("Hotel Cornice");		
		WebElement room3 = driver.findElement(By.id("room_type"));
		room3.sendKeys("Super Deluxe");		
		WebElement roomNumber3 = driver.findElement(By.id("room_nos"));
		roomNumber3.sendKeys("5 - Five");		
		WebElement adult3 = driver.findElement(By.id("adult_room"));
		adult3.sendKeys("5 - Five");		
		WebElement btnSubmit3 = driver.findElement(By.id("Submit"));
		btnSubmit3.click();
		
		WebElement btnRadio3 = driver.findElement(By.id("radiobutton_0"));
		btnRadio3.click();
		WebElement cont3 = driver.findElement(By.id("continue"));
		cont3.click();
		
		WebElement firstName3 = driver.findElement(By.id("first_name"));
		firstName3.sendKeys("Kalai");
		WebElement lastName3 = driver.findElement(By.id("last_name"));
		lastName3.sendKeys("Vani");
		WebElement address3 = driver.findElement(By.id("address"));
		address3.sendKeys("Guindy");
		WebElement ccNum3 = driver.findElement(By.id("cc_num"));
		ccNum3.sendKeys("1234567890123456");
		WebElement ccType3 = driver.findElement(By.id("cc_type"));
		ccType3.sendKeys("Other");
		WebElement ccExpMonth3 = driver.findElement(By.id("cc_exp_month"));
		ccExpMonth3.sendKeys("April");
		WebElement ccExpYear3 = driver.findElement(By.id("cc_exp_year"));
		ccExpYear3.sendKeys("2022");
		WebElement cvv3 = driver.findElement(By.id("cc_cvv"));
		cvv3.sendKeys("1234");
		WebElement book3 = driver.findElement(By.id("book_now"));
		book3.click();
		
		Thread.sleep(5000);
		
		WebElement order = driver.findElement(By.id("order_no"));
		System.out.println(order.getAttribute("value"));
		
		WebElement search3 = driver.findElement(By.id("search_hotel"));
		search3.click();
		
		Thread.sleep(3000);

		WebElement location4 = driver.findElement(By.id("location"));
		location4.sendKeys("London");	
		WebElement hotels4 = driver.findElement(By.id("hotels"));
		hotels4.sendKeys("Hotel Cornice");		
		WebElement room4 = driver.findElement(By.id("room_type"));
		room4.sendKeys("Super Deluxe");		
		WebElement roomNumber4 = driver.findElement(By.id("room_nos"));
		roomNumber4.sendKeys("5 - Five");		
		WebElement adult4 = driver.findElement(By.id("adult_room"));
		adult4.sendKeys("5 - Five");		
		WebElement btnSubmit4 = driver.findElement(By.id("Submit"));
		btnSubmit4.click();
		
		WebElement btnRadio4 = driver.findElement(By.id("radiobutton_0"));
		btnRadio4.click();
		WebElement cont4 = driver.findElement(By.id("continue"));
		cont4.click();
		
		WebElement firstName4 = driver.findElement(By.id("first_name"));
		firstName4.sendKeys("Kalai");
		WebElement lastName4 = driver.findElement(By.id("last_name"));
		lastName4.sendKeys("Vani");
		WebElement address4 = driver.findElement(By.id("address"));
		address4.sendKeys("Guindy");
		WebElement ccNum4 = driver.findElement(By.id("cc_num"));
		ccNum4.sendKeys("1234567890123456");
		WebElement ccType4 = driver.findElement(By.id("cc_type"));
		ccType4.sendKeys("Other");
		WebElement ccExpMonth4 = driver.findElement(By.id("cc_exp_month"));
		ccExpMonth4.sendKeys("April");
		WebElement ccExpYear4 = driver.findElement(By.id("cc_exp_year"));
		ccExpYear4.sendKeys("2022");
		WebElement cvv4 = driver.findElement(By.id("cc_cvv"));
		cvv4.sendKeys("1234");
		WebElement book4 = driver.findElement(By.id("book_now"));
		book4.click();
		
		Thread.sleep(5000);
		
		WebElement orderSeries = driver.findElement(By.id("order_no"));
		System.out.println(orderSeries.getAttribute("value"));
		

		
//		driver.close();
	}


}
