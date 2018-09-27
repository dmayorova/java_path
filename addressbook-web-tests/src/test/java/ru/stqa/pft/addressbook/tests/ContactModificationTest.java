package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.module.ContactData;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification() throws Exception {
    app.getNavigationHelper().gotoContactHome();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("Mayorova", "Daria", "the best company", "NN city Becetova street", "+ 7 912 111 22 44", "breaks_beats@mail.ru", "8", "December", "1990"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnToHomePage();
   }
}
