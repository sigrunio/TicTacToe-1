package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TicTacToeWebTest {
  static WebDriver driver;
  static String baseUrl;
  static boolean acceptNextAlert = true;
  static StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://tasktictactoe.herokuapp.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCheckHead() throws Exception {
    assertEquals("TicTacToe", driver.findElement(By.cssSelector("h1.cover-heading")).getText());
  }

  @Test
  public void testCheckInstructions() throws Exception {
    assertEquals("Enter a number between 1 and 9, representing a square on the board, and press Make Move. You play as X.", driver.findElement(By.cssSelector("p.lead")).getText());
  }

  @Test
  public void testMakeMovePresent() throws Exception {
    try {
      assertTrue(isElementPresent(By.xpath("//button[@type='submit']")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @Test
  public void testNewGamePresent() throws Exception {
    try {
      assertTrue(isElementPresent(By.xpath("(//button[@type='submit'])[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @Test
  public void testTextFieldPresent() throws Exception {
    try {
      assertTrue(isElementPresent(By.id("move")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @Test
  public void testIllegalInputChar() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("a");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    for (int second = 0;; second++) {
      if (second >= 60) fail("timeout");
      try { if (isElementPresent(By.cssSelector("div.success"))) break; } catch (Exception e) {}
      Thread.sleep(1000);
    }
    try {
      assertEquals("Illegal input!", driver.findElement(By.id("results")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @Test
  public void testIllegalInputToHigh() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("10");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    for (int second = 0;; second++) {
      if (second >= 60) fail("timeout");
      try { if (isElementPresent(By.cssSelector("div.success"))) break; } catch (Exception e) {}
      Thread.sleep(1000);
    }

    try {
      assertEquals("Illegal input!", driver.findElement(By.id("results")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @Test
  public void testIllegalInputToSmall() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("0");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    for (int second = 0;; second++) {
      if (second >= 60) fail("timeout");
      try { if (isElementPresent(By.cssSelector("div.success"))) break; } catch (Exception e) {}
      Thread.sleep(1000);
    }

    try {
      assertEquals("Illegal input!", driver.findElement(By.id("results")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @Test
  public void testInputToOccupiedSquare() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("1");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    for (int second = 0;; second++) {
      if (second >= 60) fail("timeout");
      try { if (isElementPresent(By.id("board"))) break; } catch (Exception e) {}
      Thread.sleep(1000);
    }

    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("1");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    for (int second = 0;; second++) {
      if (second >= 60) fail("timeout");
      try { if (isElementPresent(By.cssSelector("div.success"))) break; } catch (Exception e) {}
      Thread.sleep(1000);
    }

    try {
      assertEquals("Square Occupied!", driver.findElement(By.id("results")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
