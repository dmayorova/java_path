package ru.stqa.pft.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.module.GroupData;

public class GroupHelper extends HelperBase{

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void submitCreationGroup() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  public void modificationSelectedGroup() {
    click(By.name("edit"));
  }

  public void submitModificationGroup() {
    click(By.name("update"));
  }
  public void returnToStartPage() {
    click(By.linkText("group page"));
  }

  public void creationGroup(GroupData group) {
    initGroupCreation();
    fillGroupForm(group);
    submitCreationGroup();
    returnToStartPage();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getCountElements() {
    return wd.findElements(By.name("selected[]")).size();
  }
}
