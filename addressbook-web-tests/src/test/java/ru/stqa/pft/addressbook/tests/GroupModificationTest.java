package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.GroupData;

import java.util.List;

public class GroupModificationTest extends TestBase{

  @Test
  public void testGroupsModificationTest() throws Exception {
    app.getNavigationHelper().gotoGroupCreationPage();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().creationGroup(new GroupData("test1", null, null));
    }
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size() - 1);
    app.getGroupHelper().modificationSelectedGroup();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2v", "test3v"));
    app.getGroupHelper().submitModificationGroup();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size());
    app.getGroupHelper().returnToStartPage();
  }

}
