package ru.stqa.pft.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupCreationPage() {
    click(By.linkText("groups"));
  }
  public void returnToStartPage() {
    click(By.linkText("group page"));
  }

  public void gotoContactHome() {
    click(By.linkText("home"));
  }
  public void returnToHomePage() {
    click(By.linkText("home page"));
  }
}
