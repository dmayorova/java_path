package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.GroupData;

import java.util.ArrayList;
import java.util.List;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupCreationPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().creationGroup(new GroupData("test1", null, null));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size() + 1);
  }
}
