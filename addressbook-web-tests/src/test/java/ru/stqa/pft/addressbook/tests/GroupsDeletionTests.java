package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupsDeletionTests extends TestBase{

  @Test
  public void testGroupsDeletionTests() throws Exception {
    app.gotoGroupCreationPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnToStartPage();
  }

}
