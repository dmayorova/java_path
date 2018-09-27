package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception{
    app.getNavigationHelper().gotoContactHome();
    app.getContactHelper().editContact();
    app.getContactHelper().submitContactDeletion();
  }

}
