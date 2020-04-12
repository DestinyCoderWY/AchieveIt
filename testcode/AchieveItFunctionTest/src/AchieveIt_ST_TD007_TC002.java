import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AchieveIt_ST_TD007_TC002 {
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
    driver.findElement(By.xpath("//div[@id='pic']/div/form/div[3]/div/button/span")).click();
    driver.findElement(By.xpath("//div[@id='app']/section/section/main/div/div/div[3]/ul/li[2]")).click();
    driver.findElement(By.xpath("//div[@id='app']/section/section/main/div/div/div[2]/div[3]/table/tbody/tr[2]/td/div/button/i")).click();
    driver.findElement(By.id("tab-2")).click();
    Thread.sleep(300);
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.xpath("//div[@id='pane-2']/div/div/span/span/i[2]")).click();
    driver.findElement(By.xpath("//div[@id='pane-2']/div/div/span/span/i")).click();
    driver.findElement(By.xpath("//div[@id='pane-2']/div/div/span/span/i")).click();
  }

  @After
  public void tearDown() throws Exception {
    //driver.quit();
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
