package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.ContactData;
import ru.stqa.pft.addressbook.module.GroupData;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification() throws Exception {
    app.getNavigationHelper().gotoContactHome();
    if (!app.getContactHelper().isThereAContact()){
      app.getNavigationHelper().gotoGroupCreationPage();
      if (!app.getGroupHelper().isThereAGroup()){
        app.getGroupHelper().creationGroup(new GroupData("test1", null, null));
      } else {
        app.getNavigationHelper().gotoGroupCreationPage();
      }
      app.getContactHelper().creationContact(new ContactData("Mayorova", "Daria", "the best company", "NN city Becetova street", "+ 7 912 111 22 44", "breaks_beats@mail.ru", "test1","8", "December", "1990"));
    }
    int before = app.getContactHelper().getCountElements();
    app.getContactHelper().editContact(before - 1);
    app.getContactHelper().fillContactForm(new ContactData("Mayorova", "Daria", "the best company", "NN city Becetova street", "+ 7 912 111 22 44", "breaks_beats@mail.ru", null,"8", "December", "1990"));
    app.getContactHelper().submitContactModification();
    int after = app.getContactHelper().getCountElements();
    Assert.assertEquals(after,before);
    app.getContactHelper().returnToHomePage();
   }
}
