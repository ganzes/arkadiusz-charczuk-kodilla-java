package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_FB_MONTH ="//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_SELECT_FB_MONTH_DAY ="//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_SELECT_FB_YEAR ="//span[contains(@class, \"_5k_4\")]/span/select[3]";
    public static final String XPATH_SELECT_FB_NAME ="//div[contains(@class, \"_5dbb\")]/div/input";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT_FB_MONTH));
        Select selectMonth = new Select(selectCombo);
        selectMonth.selectByIndex(3);

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_SELECT_FB_MONTH_DAY));
        Select selectMonthDay = new Select(selectCombo1);
        selectMonthDay.selectByIndex(7);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT_FB_YEAR));
        Select selectYear = new Select(selectCombo2);
        selectYear.selectByValue("1987");

        WebElement searchName = driver.findElement(By.xpath(XPATH_SELECT_FB_NAME));
        searchName.sendKeys("Kodilla");
    }
}
