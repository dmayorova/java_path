package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupCreationPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitCreationGroup();
    returnToStartPage();
  }
}
