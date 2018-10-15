package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.GroupData;

public class GroupsDeletionTest extends TestBase{

  @Test
  public void testGroupsDeletionTests() throws Exception {
    app.getNavigationHelper().gotoGroupCreationPage();
    int before = app.getGroupHelper().getCountElements();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().creationGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    int after = app.getGroupHelper().getCountElements();
    Assert.assertEquals(after,before - 1);
    app.getGroupHelper().returnToStartPage();
  }

}
