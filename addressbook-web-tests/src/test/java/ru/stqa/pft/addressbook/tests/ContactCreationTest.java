package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.ContactData;
import ru.stqa.pft.addressbook.module.GroupData;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoGroupCreationPage();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().creationGroup(new GroupData("test1", null, null));
    } else {
      app.getNavigationHelper().gotoContactHome();
    }
    app.getContactHelper().creationContact(new ContactData("Mayorova", "Daria", "the best company", "NN city Becetova street", "+ 7 912 111 22 44", "breaks_beats@mail.ru", "test1","8", "December", "1990"));
  }
}
