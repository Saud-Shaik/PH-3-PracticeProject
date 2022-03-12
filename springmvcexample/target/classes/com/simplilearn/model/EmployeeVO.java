package com.simplilearn.model;

import java.io.Serializable;

public class EmployeeVO implements Serializable 
{
  private static final long serialVersionUID = 1L;
 
  private Integer id;
  private String firstName;
  private String lastName;
  private String email;
 
  //Getters and Setters
 
  @Override
  public String toString() {
    return "EmployeeVO [id=" + id + ", firstName=" + firstName
        + ", lastName=" + lastName + ", email=" + email + "]";
  }
}