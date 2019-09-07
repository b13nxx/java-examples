package com.bahricanakkoyun.mainpackage;

/* encapsulation is a way to achieve 'data hiding' in Java
   because other class will not be able to access the data through the private data members */
class Student {
  // we can create a fully encapsulated class in Java by making all the data members of the class private
  private String college;

  // now we can use setter and getter methods to set and get the data in it
  void setCollege(String college) {
    this.college = college;
  }

  String getCollege() {
    return this.college;
  }
}
