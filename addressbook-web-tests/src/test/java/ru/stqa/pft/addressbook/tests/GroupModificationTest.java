package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.GroupData;

public class GroupModificationTest extends TestBase{

  @Test
  public void testGroupsModificationTest() throws Exception {
    app.getNavigationHelper().gotoGroupCreationPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().modificationSelectedGroup();
    app.getGroupHelper().fillGroupForm(new GroupData("test1v", "test2v", "test3v"));
    app.getGroupHelper().submitModificationGroup();
    app.getNavigationHelper().returnToStartPage();
  }

}
