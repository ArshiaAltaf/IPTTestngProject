package org.utilities;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	
	public static WebDriver driver;
	public static Alert a;
	public static Actions ac;
	public static Robot r;
	public static Select sel;
	
	// 1	
    public static void openedge() {
    	
	    WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	}
	
    // 2
	public static void openchrome() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	// 3
	public static void getDateandtime() {
		
		Date d = new Date();
		System.out.println(d);
	}
	
	// 4
    public static void launcherurl(String pageurl) {
    	
		driver.get(pageurl);
	}
	
    // 5
	public static void To(String url) {
		
		driver.navigate().to(url);
	}
	
	// 6
	public static void forward() {
		
		driver.navigate().forward();
	}
	
	// 7
	public static void back() {
		
		driver.navigate().back();
	}
	
	// 8
	public static void Reload() {
		
		driver.navigate().refresh();
	}
	
	// 9
	public static void urlpassing(String url) {
		
		driver.get(url);
	}
	
	// 10
	public static void pagesource() {
		
		String source = driver.getPageSource();
		System.out.println(source);
	}
	
	// 11
	public static void printTitle() {
		
		String titlename = driver.getTitle();
        System.out.println(titlename);
    }    
    
	// 12
	public static void printurl() {
		
		String url = driver.getCurrentUrl();
        System.out.println(url);
	}
	
	// 13
	public static void printText(WebElement element) {
		
		String text = element.getText();
		System.out.println(text);
	}
	
	// 14
	public static void printAttribute(WebElement element, String name) {
		
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
	}
	
	// 15
	public static void size(WebElement element) {
		
		Dimension size = element.getSize();
		System.out.println(size);
	}
	
	// 16
	public static void classname() {
		
		driver.getClass();

	}
	
	// 17
	public static void Cssvalue(WebElement element, String propertyName) {
		
		String cssValue = element.getCssValue(propertyName);
		System.out.println(cssValue);
		
	}
	
	// 18
	public static void tagname(WebElement element) {
		
		String tagName = element.getTagName();
		System.out.println(tagName);
		
    }
	
	// 19
	public static void windowhandle() {
		
		driver.getWindowHandle();

	}
	
	// 20
	public static void windowhandles() {
		
		driver.getWindowHandles();

	}
	
	// 21
	public static void acceptAlert() {
		
		a = driver.switchTo().alert();
		a.accept();

	}
	
	// 22
	public static void cancelAlert() {
		
		a = driver.switchTo().alert();
		a.dismiss();

	}
	
	// 23
	public static void display(WebElement element) {
		
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}
	
	// 24
	public static void enable(WebElement element) {
		
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
		
	}
	
	// 25
	public static void select(WebElement element) {
		
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
	// 26
	public static void SelectByValue(WebElement ele, String value) {
		
		sel.selectByValue(value);
	}
	
	// 27
	public static void SelectByVisibleText(WebElement ele, String text) {
		
		sel.selectByVisibleText(text);
	}
	
	// 28
	public static void SelectByIndex(WebElement ele, int index) {
		
		sel.selectByIndex(index);

	}
	
	// 29
	public static void multiple(WebElement ele) {
		
		sel.isMultiple();

	}
	
	// 30
	public static void options(WebElement ele) {
		
		sel.getOptions();

	}
	
	// 31
	public static void AllSelectOptions(WebElement ele) {
		
		sel.getAllSelectedOptions();

	}
	
	// 32
	public static void FirstSelectOptions(WebElement ele) {
		
		sel.getFirstSelectedOption();
	}
	
	// 33
	public static void DeSelectAll() {
		
		sel.deselectAll();

	}
	
	// 34
	public static void DeSelectVisibleText(String text) {
		
		sel.deselectByVisibleText(text);

	}
	
	// 35
	public static void DeSelectValue(String value) {
		
		sel.deselectByValue(value);

	}
	
	// 36
	public static void DeSelectIndex(int index) {
		
		sel.deselectByIndex(index);

	}
	
	// 37
	public static void dragDrop(WebElement e1,WebElement e2) {
		
        ac.dragAndDrop(e1, e2).perform();

	}
	
	// 38
	public static void mouseHovering(WebElement ele) {
		
		ac.moveToElement(ele).perform();
	}
	
	// 39
	public static void copyUsingkeyboard() throws AWTException {
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	// 40
	public static void pasteUsingkeyboard() throws AWTException {
		
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
    }
	
	// 41
	public static void enterUsingkeyboard() throws AWTException {
		
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }
	
	// 42
	public static void fillUsingJs(String string, String input) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value',' "+ input +" ')", string);
	}
	
	// 43
	public static void screenshot(String name) throws IOException {
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File sr = tk.getScreenshotAs(OutputType.FILE);
		File de = new File("C:\\Users\\ADMIN\\eclipse-workspace\\IPTCucumber\\target\\Screenshot\\"+name+".jpg");
		FileUtils.copyFile(sr, de);
	}
	
	// 44
	public static void closebrowser() {
		
		driver.quit();

	}
	
	// 45
	public static void closecurrenttab() {
		
		driver.close();

	}
	
	// 46
	public static void maxwindow() {
		
		driver.manage().window().maximize();
	}
	
	// 47
	public static void filltextbox(WebElement element,String input) {
		
	    element.sendKeys(input);
		
	}
	
	// 48
	public static void toclick(WebElement element) {
		
	    element.click();
		
	}
	
	// 49
	public static void clear(WebElement element) {
		
		element.clear();

	}
	
	// 50
	public static void submit(WebElement element) {
		
		element.submit();

	}
	
	// 51
	public static void findelement(WebElement element, By by) {
		
		element.findElement(by);

	}
	
	// 52
	public static void findelements(WebElement element, By by) {
		
		element.findElements(by);

	}

	// 53
    public static void sleep(int time) throws InterruptedException {
		
		Thread.sleep(time);

	}

    // 54
    public static void ImplicitWait() throws InterruptedException {
		driver.manage().timeouts().getPageLoadTimeout();

	}
	
	// 55
	public static void sendkeys(WebElement element, CharSequence keysToSend) {
		
		element.sendKeys(keysToSend);
	}
	
	//56
	public static void doubleclick() {
		ac.doubleClick();

	}
	
	//57
	public static void contextclick() {
		ac.contextClick();

	}
	
	//58
	public static void Location(WebElement element) {
		Point location = element.getLocation();
		System.out.println(location);

	}
	
	//59
	public static void Rect(WebElement element) {
		Rectangle rect = element.getRect();
		System.out.println(rect);

	}
	
	//60
public static void readData(String sheetName, int rowNo, int cellNo) throws IOException {
		
	
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\IPTCucumber\\ExcelSheet\\FB.xlsx");
		
		FileInputStream fil = new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(fil);
		
		Sheet st = book.getSheet("Details");
		
		for (int i = 0; i < st.getPhysicalNumberOfRows(); i++) {
			
			Row r = st.getRow(i);
			
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			
			Cell c = r.getCell(j);
			
			int type = c.getCellType();
			
		if (type==1) {
			
			String name = c.getStringCellValue();
			System.out.println(name);
			
		}	
		else if (DateUtil.isCellDateFormatted(c)) {
			
			Date dd = c.getDateCellValue();
			
			SimpleDateFormat sim = new SimpleDateFormat("yyyy-MMM-dd");
			String sg = sim.format(dd);
			System.out.println(sg);
		}
		else {
			
			double dou = c.getNumericCellValue();
			
			long lo =(long)dou;
			
			String g = String.valueOf(lo);
			System.out.println(g);
			
		}
		
		}	
					
		}
				
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	


