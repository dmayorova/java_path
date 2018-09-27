package ru.stqa.pft.addressbook.module;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String company;
  private final String address;
  private final String phone;
  private final String email;
  private final String day;
  private final String month;
  private final String year;

  public ContactData(String firstName, String lastName, String company, String address, String phone, String email, String day, String month, String year) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.company = company;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public String getDay() {
    return day;
  }

  public String getMonth() {
    return month;
  }

  public String getYear() {
    return year;
  }
}
