package com.bahricanakkoyun.mainpackage;

class Address {
  private String city, state, country;

  Address(String city, String state, String country) {
    this.city = city;
    this.state = state;
    this.country = country;
  }

  @Override
  public String toString() {
    return this.city + ", " + this.state + ", " + this.country;
  }
}
