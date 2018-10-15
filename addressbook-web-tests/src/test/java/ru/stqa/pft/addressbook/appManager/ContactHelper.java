package ru.stqa.pft.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.module.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void initNewContact() {
    click(By.linkText("add new"));
  }

  public void submitContactForm() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"),contactData.getFirstName());
    type(By.name("lastname"),contactData.getLastName());
    type(By.name("company"),contactData.getCompany());
    type(By.name("address"),contactData.getAddress());
    type(By.name("mobile"),contactData.getPhone());
    type(By.name("email"),contactData.getEmail());
    if(isElementPresent(By.name("new_group"))){
      chooseFromList(By.name("new_group"), contactData.getGroup());
    }
    chooseFromList(By.name("bday"), contactData.getDay());
    chooseFromList(By.name("bmonth"), contactData.getMonth());
    type(By.name("byear"),contactData.getYear());
  }

  public void editContact(int index) {
    wd.findElements(By.xpath("//img[@alt='Edit']")).get(index).click();
  }

  public void submitContactModification() {
    click(By.xpath("(//input[@name='update'])[2]"));
  }

  public void submitContactDeletion() {
    click(By.xpath("(//input[@name='update'])[3]"));
  }
  public void returnToHomePage() {
    click(By.linkText("home"));
  }

  public void creationContact(ContactData contact) {
    initNewContact();
    fillContactForm(contact);
    submitContactForm();
    returnToHomePage();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("//img[@alt='Edit']"));
  }

  public int getCountElements() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> grtContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.cssSelector("span.contact"));
    for(WebElement element: elements ){
      String name = element.getText();
      ContactData contact = new ContactData(name,null,null,null,null,null,null,null,null,null);
      contacts.add(contact);
    }
    return  contacts;
  }
}
