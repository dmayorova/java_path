package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupsDeletionTest extends TestBase{

  @Test
  public void testGroupsDeletionTests() throws Exception {
    app.getNavigationHelper().gotoGroupCreationPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getNavigationHelper().returnToStartPage();
  }

}