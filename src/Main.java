import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
public static void main(String[] args) {
// Set the path to the chromedriver executable
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
// Initialize a new ChromeDriver instance
WebDriver driver = new ChromeDriver();
// Navigate to the webpage
driver.get("https://www.example.com");
// Get the actual title of the webpage
String actualTitle = driver.getTitle();
String expectedTitle = "Example Domain";
// Verify the title of the webpage
if (actualTitle.equals(expectedTitle)) {
System.out.println("Title matched!");
} else {
System.out.println("Title didn't match!");
}
// Close the browser
driver.quit();
}
}
