package com.agp.profile.entities;

import java.io.Serializable;

/** Profile */
public class Profile implements Serializable {

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  //Members
  private String firstName;
  private String lastName;
  private String email;
  private String phone;
  private String about;

  //Methods
  public String getName() {
    return firstName+ " " + lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }
}
