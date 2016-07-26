package com.dataedge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFilesDemo {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		  
		// Open browser with profile                   
		WebDriver driver=new FirefoxDriver(profile);
		  
		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		// Maximize window
		driver.manage().window().maximize();
		  
		// Open APP to download application
		//driver.get("http://www.filehippo.com/download_adobe_reader");
		driver.get("http://www.filehorse.com/download-vlc-32/");
		  
		// Click on download 
		//driver.findElement(By.xpath(".//*[@id='program-header']/div[2]/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='btn_free_download']")).click();
		    
	}
}
