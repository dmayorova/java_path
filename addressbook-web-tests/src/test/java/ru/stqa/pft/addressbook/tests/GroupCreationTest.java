package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.GroupData;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupCreationPage();
    int before = app.getGroupHelper().getCountElements();
    app.getGroupHelper().creationGroup(new GroupData("test1", null, null));
    int after = app.getGroupHelper().getCountElements();
    Assert.assertEquals(after,before + 1);
  }
}
