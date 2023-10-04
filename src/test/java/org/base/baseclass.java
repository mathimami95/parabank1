package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	public static WebDriver driver;

	   public void initidriver(String browser) {
		   switch(browser) {
		   case "chrome":
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\dall\\eclipse-workspace\\seleniumhotelbookind300823\\driver\\chromedriver.exe");
			driver = new ChromeDriver ();
		
		   break;
		   case "Edge": 
		   System.setProperty("webdriver.chrome.edgedriver","C:\\Users\\dall\\eclipse-workspace\\framewokj06092320\\driver\\msedgedriver.exe");
				driver = new EdgeDriver ();
				break;
				default:
				System.out.println("none of the browser");
			}}
	   
	   public void geturl(String url) {
		driver.get(url);
	}
	   
	   public void windowmax() {
		driver.manage().window().maximize();
	}
	    public void textsend(WebElement element, String KeysToSend) {
		 element.sendKeys(KeysToSend);
	}
	    public void selectby(WebElement element, String text) {
		 Select s = new Select(element);
		
	}
	    public void selectByValue(WebElement element, String value) {
	    Select s= new Select(element);
		
	}
	    public void click(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click();
		
	}
	    public void getattribute(WebElement element,String Value){
		element.getAttribute(Value);
		
	}
	    public void getText(WebElement element,String Value) {
		element.getText();
	}
	   public void Screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(Sourcefile);
	   File targetfile = new File("C:\\Users\\dall\\Desktop\\selenium\\New folder\\"+name+".png");
	   FileUtils.copyFile(Sourcefile, targetfile);
	}
		

		public void clear(WebElement checkoutElement) {
			Actions act = new Actions(driver);
			act.moveToElement(checkoutElement).click();
			
		}
	    public void textsend( String KeysToSend,WebElement element) {
		 element.sendKeys(KeysToSend);
	}
		public String excelread(int rowno, int cellno){
			try {
			File file = new File("C:\\Users\\dall\\Desktop\\xcel\\JK.xlsx");
			FileInputStream input = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(input);
			Sheet sheet = book.getSheet("sheet1");
			
				Row row = sheet.getRow(rowno);
				
			
					Cell cell = row.getCell(cellno);

					
					CellType cellType = cell.getCellType();
					String value = null;
					switch(cellType) {
					case STRING:
						value = cell.getStringCellValue();

				

				
						break;
					case NUMERIC:
						if(DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();
							SimpleDateFormat simple = new SimpleDateFormat("dd/mm/yyyy");
							value =simple.format(dateCellValue);
							

							
											}else {
											double numericcellvalue = cell.getNumericCellValue();
											long l = (long)numericcellvalue;
											BigDecimal valueof = BigDecimal.valueOf(l);
											value = valueof.toString();
										}
										
					
						
						
										
										break;
										default:
											System.out.println("invalid");
										break;
									
				
							

	}

			
			
			return value;}
		catch (Exception e) {
		}
	return null;
	}
		public static String capture(WebDriver driver) {
			String errflpath = null;
			try {
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File Dest = new File("src/../ErrImages/"+System.currentTimeMillis()+".png");
				errflpath = Dest.getAbsolutePath();
				FileUtils.copyFile(scrFile, Dest);
			}catch(Exception e) {
				
			}
		return errflpath;		
			
		}
			
		}
		
		



		



