
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AchieveIt_ST_TD003_TC008 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLogin() throws Exception {
    driver.get("http://47.101.150.198/#/");
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(300);
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    Thread.sleep(300);
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
    Thread.sleep(300);
    driver.findElement(By.xpath("//div[3]/div/div/ul/li[2]")).click();
    Thread.sleep(300);
    driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
    Thread.sleep(300);
    driver.findElement(By.xpath("//div[4]/div/div/ul/li[2]")).click();
    Thread.sleep(300);
    driver.findElement(By.xpath("//input[@name='']")).click();
    Thread.sleep(300);
    driver.findElement(By.xpath("//td[4]/div/span")).click();
    driver.findElement(By.xpath("//div[@id='app']/section/section/main/div[2]/div/div[3]")).click();
    driver.findElement(By.xpath("//div[@id='app']/section/section/main/div[2]/div/div[3]/div/button[2]/span")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
