package automation;

import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://test.kommunicate.io/");
		//driver.findElements(By.xpath("path"));
		//driver.findElements(By.xpath("\"#FFF\" d=\"M21.25 18.48V7.31a7.3 7.3 0 0 0-7.3-7.3H7.31a7.3 7.3 0 1 0 0 14.6h7.2s.58.04.93.17c.34.12.71.42.71.42l4.44 3.66s.4.34.55.27c.15-.07.11-.65.11-.65zM7.51 8.8c0 .49-.42.88-.95.88-.52 0-.95-.4-.95-.88V5.67c0-.49.43-.88.95-.88.53 0 .95.4.95.88V8.8zm4.07 1.48c0 .49-.43.88-.95.88s-.95-.39-.95-.88v-6.1c0-.48.43-.88.95-.88s.95.4.95.88v6.1zm4.06-1.48c0 .49-.42.88-.95.88-.52 0-.94-.4-.94-.88V5.67c0-.49.42-.88.94-.88.53 0 .95.4.95.88V8.8z\""));
		//driver.findElement(By.xpath("/html/body/div[5]/a/div[2]/svg/path")).click();
		//WebDriverWait wait = new WebDriverWait(driver,60) ;
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("alime-header-close-button")));
		//driver.findElements(By.xpath("//*[@id=\"km-faq\"]"));
		//driver.findElement(By.id("alime-header-close-button")).click();
		//System.out.println("Found Closing button for Chat Bot, clicked on that...");
		//driver.close();
		//System.exit(0);
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[5]/a/div[2]/svg/path")));
		//p[@class='chat-popup-widget-text']
		//driver.findElement(By.xpath("//p[@class='chat-popup-widget-text']"));
		//div[@class='chat-popup-widget-close-btn-container']
		//driver.findElement(By.xpath("//div[@class='chat-popup-widget-close-btn-container']"));
		//driver.findElement(By.id("launcher-svg-container"));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//WebElement ele=driver.findElement(By.xpath("//div[@id='launcher-svg-container']"));
		//driver.switchTo().frame(ele);
		//ele.click();
		//driver.findElement(By.xpath("//iframe[2]")).click();
		
		//List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
		//System.out.println("Total number of iframes are " + iframeElements.size());

		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("No. of iframes on the page are " + noOfFrames);
		//driver.switchTo().frame(2);
		//driver.quit();
		//driver.findElement(By.id("kommunicate-widget-iframe"));
		//driver.findElement(By.xpath("//iframe[2]")).click();
		driver.switchTo().frame("Kommunicate widget iframe"); //BY frame name
		//driver.switchTo().frame("mck-tab-title");
		WebElement ele=driver.findElement(By.xpath("//div[@id='launcher-svg-container']"));//chat icon
		ele.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.switchTo().frame("Kommunicate widget iframe");
		driver.findElement(By.xpath("//div[@class='km-kb-container vis']")).click();
		//driver.findElement(By.xpath("//button[@id='km-faq']")).click();
		

		
		//driver.findElements(By.xpath("//div[@id='km-faqdiv']")).size();
		//List<WebElement> ele1=driver.findElements(By.xpath("//div[@class='faq-common vis']//li[1]"));
		//System.out.println(ele1.size());
		//ele1.count();
		List<WebElement> list = driver.findElements(By.xpath("//a"));    //Identify the number of lists on webpage and assign into Webelement List 
        
        int FAQCount = list.size();     // Count the total no.of lists on Web Page
        
        System.out.println("Total Number of FAQCount on webpage = "  + FAQCount);    //Print the total count of lists on webpage
        
        List<WebElement> allElements = driver.findElements(By.xpath("//*"));      //Identify all the elements on web page
        
        //int elementsCount = allElements.size();     //Count the total all element on web page
        
        //System.out.println("Total Number of All Element on webpage = "  + elementsCount);
        
       // driver.get("https://accounts.google.com/signin");
        //WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
      // driver.findElement(By.xpath("//input[@name='identifier' or @id='identifierId']")).sendKeys("shalinigmv@gmail.com");
		
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
		
		// object is created of Property file
				Properties props = new Properties();
		 
				//  Host server set automatically- you can change based on your requirement 
				props.put("mail.smtp.host", "smtp.gmail.com");
		 
				// set the port of socket factory 
				props.put("mail.smtp.socketFactory.port", "465");
		 
				// set socket factory
				props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		 
				// set the authentication to true
				props.put("mail.smtp.auth", "true");
		 
				// set the port of SMTP server
				props.put("mail.smtp.port", "465");
		 
				// This will handle the complete authentication
				Session session = Session.getDefaultInstance(props,
		 
						new javax.mail.Authenticator() {
		 
							protected PasswordAuthentication getPasswordAuthentication() {
		 
							return new PasswordAuthentication("valid email", "valid password");
		 
							}
		 
						});
				
				
				
				int FAQCount1=20;
				
				if(FAQCount > FAQCount1)
				{
					System.out.println("FAQCount is morethan FAQCount1 and Total FAQCount is "+FAQCount);
				}
		 
				else
				{
				try {
		 
					// Create object of MimeMessage class
					Message message = new MimeMessage(session);
		 
					// Set the from address
					message.setFrom(new InternetAddress("valid email"));
		 
					// Set the recipient address
					message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("valid email"));
		            
		                        // Add the subject link
					message.setSubject("Testing Subject");
		 
					// Create object to add multimedia type content
					BodyPart messageBodyPart1 = new MimeBodyPart();
		 
					// Set the body of email
					messageBodyPart1.setText("This is message body");
		 
					// Create another object to add another content
					MimeBodyPart messageBodyPart2 = new MimeBodyPart();
		 
					// Mention the file which you want to send
					String filename = "F:\\a.xlsx";
		 
					// Create data source and pass the filename
					DataSource source = new FileDataSource(filename);
		 
					// set the handler
					messageBodyPart2.setDataHandler(new DataHandler(source));
		 
					// set the file
					messageBodyPart2.setFileName(filename);
		 
					// Create object of MimeMultipart class
					Multipart multipart = new MimeMultipart();
		 
					// add body part 1
					multipart.addBodyPart(messageBodyPart2);
		 
					// add body part 2
					multipart.addBodyPart(messageBodyPart1);
		 
					// set the content
					message.setContent(multipart);
		 
					// finally send the email
					Transport.send(message);
		 
					System.out.println("=====Email Sent=====");
		 
				} catch (MessagingException e) {
		 
					throw new RuntimeException(e);
		 
				}
		 
	 

			
			
			
		}

       
       
       
       
       
       
       
       
       
       
       
		//driver.quit();
		
}

}
