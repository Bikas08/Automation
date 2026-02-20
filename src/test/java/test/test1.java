package test;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class test1 {
    
    
//        public static void main(String[] args) throws InterruptedException {
	@Test
			public void test() {
            try (Playwright playwright = Playwright.create()) {
//	            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//	            Page page = browser.newPage();
//	            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
//	            	    .setViewportSize(null));
//	            //page.navigate("https://ultimateqa.com/dummy-automation-websites");
//	            //System.out.println(page.title());
//	            //assertThat(page).hasTitle(Pattern.compile("Playwright"));
//	            page.navigate("https://ultimateqa.com/automation");
//	            System.out.println("done");
//	            page.locator("//a[text()='Big page with many elements']").click();
//	            page.locator("et_pb_contact_name_0").fill("Bikas")	;
//	            page.getByTestId("et_pb_contact_email_0").fill("ab@ab.com");
	            /****/
	                  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	                    .setHeadless(false));
	                  BrowserContext context = browser.newContext();
	                  Page page = context.newPage();
//	                  page.navigate("https://blazedemo.com/");
//	                  page.locator("text=destination of the week! The Beach!").click();
//	                  System.out.println( page.locator("text=Destination of the week: Hawaii !").textContent().strip());
//	                  assertThat(page.locator("text=Destination of the week: Hawaii !")).equals("Destination of the week: Hawaii !");
//	                  page.goBack();
//	                  //selecting from dropdown
//	                  page.locator("select[name='fromPort']").selectOption("Boston");
//	                  page.locator("select[name='toPort']").selectOption("New York");
//	                  page.locator("input[type='submit']").click();
//	                 System.out.println( page.locator(".container h3").textContent());
//	                 // get second row 2 element
//	                 List<String> val=page.locator("table tbody tr td").allTextContents();
//	                 for(String v:val) {
//	                	 System.out.println(v);
//	                	 if(v.equals("234")) {
//	                		 page.locator("table tbody tr td input").nth(v.indexOf(v)).click();
//	                		 break;
//	                	 }
//	                 }
//	                 System.out.println(page.locator("p:has-text('Flight Number: UA954')").textContent());
//	        		page.locator("input#inputName").fill("Bikas");
//	        		page.locator("input#address").fill("address line 1");
//	        		page.locator("//input[@id='city']").fill("city name");
//	        		page.locator("input#state").fill("state name");
//	        		page.locator("input#zipCode").fill("123456");
//	        		page.locator("select[name=cardType]").selectOption("visa");
//	        		page.locator("input#creditCardNumber").fill("1234 5678 9876 5432");
//	        		page.locator("input#creditCardMonth").fill("12");
//	        		page.getByPlaceholder("Year").fill("2026");
//	        		page.locator("input#nameOnCard").fill("Bikas");
//	        		page.locator("input#rememberMe").click();
//	        		page.locator("input[type='submit']").click();
//	        		page.locator("text=Thank you for your purchase today!").isVisible();
//	        		System.out.println("Test completed successfully");
	                  page.navigate("https://www.orangehrm.com/");
	                  System.out.println(page.title());
	                  String selectors = " button:has-text('Allow')";
	                  Locator cookieBtn = page.locator(selectors);

	                  if (cookieBtn.count() > 0) {
	                      cookieBtn.first().click();
	                  }
	                  page.locator("text=Contact Sales").nth(2).scrollIntoViewIfNeeded();
                                                                                                	                  
                  
            
              }
            
        
    }
}
