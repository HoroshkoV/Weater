import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class practik {
    static String url = "https://openweathermap.org/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //  driver.get("https://home.openweathermap.org/questions");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        String api = "//div[@id='desktop-menu']//a[@href='/api']";
        String w = "//div[@id='desktop-menu']//a[text()='Dashboard']";
        String f = "//div[@id='weather-widget']//div[text()='Imperial: °F, mph']";
        String mobil = "//ul[@id='mobile-menu']//a[text()='Guide']";

        driver.findElement(By.xpath("//div[@id='desktop-menu']//a[@href='/api']")).click();
        List<WebElement> button = driver.findElements(By.xpath("//a[contains(@class, 'btn_block orange round') " +
                "or contains(@class, 'ow-btn round btn-orange') ]"));



        for (int i = 0; i < button.size(); i++) {


            System.out.println("" + i + button.get(i).getAttribute("href"));

            System.out.println("" + (i +1)+ "  " + button.get(i).getCssValue("background-color"));


        }



/*String city ="Rome";

        driver.findElement(By.xpath("//div[@id='desktop-menu']//form[@role='search']//input[@name='q']")).sendKeys(city);
        driver.findElement(By.xpath("//div[@id='desktop-menu']//form[@role='search']//input[@name='q']")).sendKeys(Keys.ENTER);
        String find = driver.findElement(By.xpath("//input[@id='search_str']")).getAttribute("value");
        String url =driver.getCurrentUrl();
         System.out.println(find.equalsIgnoreCase(city));
        System.out.println(url.contains("find?q=".concat(find)));

        driver.quit();*/
        //  driver.findElement(By.xpath("//div[@id='support-dropdown']")).click();
        // driver.findElement(By.xpath("//div[@id='support-dropdown']")).click();
        //
       /* driver.findElement(By.xpath("//ul[@id='support-dropdown-menu']"
                + "//a[@href='https://home.openweathermap.org/questions']")).click();*/
       /* Thread.sleep(8000);
        System.out.println(driver.getWindowHandles());
        ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());//Получение списка табов
        System.out.println(tabs2.get(0));

        System.out.println(tabs2.get(1));
        driver.close();*/

        //    driver.switchTo().window(tabs2.get(1));//Переключение на второй таб в браузере
        // driver.switchTo().window((String) tabs2.get(0));//Переключение на первый таб в браузере
        //  driver.close();//Закрытие активного таба


        // driver.findElement(By.xpath("//input[@id='question_form_email']")).sendKeys("horoshko");
        // WebElement element =driver.findElement(By.xpath("//select[@id='question_form_subject']"));
        //  Select select = new Select(driver.findElement(By.xpath("//select[@id='question_form_subject']")));
        // WebElement out = webDriver.findElement(By.id("out1"));
        //  select.selectByIndex(1);
        //   driver.findElement(By.xpath("//textarea[@id='question_form_message']")).sendKeys("Message");
/*

        driver.switchTo().frame((0));
        driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
        Thread.sleep(8000);
        driver.switchTo().window(tabs2.get(1));
        driver.findElement(By.xpath("//input[@name='commit']")).submit();
        String expectedResult = driver.findElement(By.xpath("//div[@class='form-group email required question_form_email has-error']//span[@class='help-block']")).getText();
*/

        //   System.out.println(driver.findElement(By.xpath("//div[@class='has-error']//div[@class='help-block']")).getText());
        //div[@class='has-error']//div[@class='help-block']

        /*if (!select.isMultiple()) {
            select.selectByIndex(1);
            System.out.println(out.getText());
            select.selectByIndex(2);
            System.out.println(out.getText());
        }*/



        /*Thread.sleep(5000);
        driver.findElement(By.xpath("//body[@class ='body-orange']//nav[@id='nav-website']//li[@id='hamburger']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(mobil)).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body[@class ='body-orange']//nav[@id='nav-website']//li[@id='hamburger']")).click();
        driver.findElement(By.xpath("//ul[@id='mobile-menu']//a[text()='Dashboard']")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body[@class ='body-orange']//nav[@id='nav-website']//li[@id='hamburger']")).click();
        driver.findElement(By.xpath("//ul[@id='mobile-menu']//a[@href='/api']")).click();

        System.out.println(driver.getTitle());*/
       /* WebElement elementGuide = driver.findElement(By.xpath("//div[@id='desktop-menu']//a[@href='/guide']"));
        System.out.println(elementGuide.getText());
        elementGuide.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(api)).click();
        System.out.println(driver.findElement(By.xpath(api)).getText());
        Thread.sleep(5000);
        driver.findElement(By.xpath(w)).click();
        System.out.println(driver.findElement(By.xpath(w)).getText());
        Thread.sleep(5000);

        driver.quit();
        driver.close();*/


    }

    //
    // Test cases for AssertTrue
   /* public static void verifyAssertTrue() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        // Open browser and pass URL in address bar
        WebElement Navigation = driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']"));
        WebElement SignInButton = driver.findElement(By.xpath("//span[text()='Sign in']"));
        Actions move = new Actions(driver);
        move.moveToElement(Navigation).build().perform();
        Boolean checkButtonPresence = SignInButton.isDisplayed();

        System.out.println("Button is displayed" + checkButtonPresence);
    }*/


}
// div[@id="weather-widget"]/div[1]//div[text()='Imperial: °F, mph']

//ul[@id="mobile-menu"]//a[text()='Guide']

//nav[@id='nav-website']//li[@id='hamburger']