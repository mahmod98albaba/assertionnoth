package assertion;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parass {
	static WebDriver driver = new ChromeDriver();

	Random rand = new Random ();
	int RandomEmail=rand.nextInt(999);
	

	static String WebsiteUrl = "https://magento.softwaretestingboard.com/";
	static String signUpPage = "https://magento.softwaretestingboard.com/customer/account/create/";
	static String logOutPage = "https://magento.softwaretestingboard.com/customer/account/logout/";
	static String loginPage = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/";
	  static String checkTheUrl ="https://magento.softwaretestingboard.com/customer/account/";

	static String[] FirstNameArray = { "leena", "sama", "suha", "reem"  };
	static String[] LastNameArray = { "Khalel", "Sami", "Raid", "Mohammed" };
	
	int randomIndex = rand.nextInt(5);
	String Pass = "MAhmod2121@" ;
	String fatherNames = LastNameArray[randomIndex];
	String Name = FirstNameArray[randomIndex];
	String Emailg = Name+fatherNames+RandomEmail+"@gmail.com";
	

}