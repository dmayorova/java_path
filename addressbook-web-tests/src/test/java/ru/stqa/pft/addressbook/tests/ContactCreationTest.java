package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.module.ContactData;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Mayorova", "Daria", "the best company", "NN city Becetova street", "+ 7 912 111 22 44", "breaks_beats@mail.ru", "8", "December", "1990"));
    app.getContactHelper().submitContactForm();
  }
}
