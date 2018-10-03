package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.GroupData;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupCreationPage();
    app.getGroupHelper().creationGroup(new GroupData("test1", null, null));
  }
}
