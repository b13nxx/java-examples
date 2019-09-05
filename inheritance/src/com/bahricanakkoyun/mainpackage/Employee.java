package com.bahricanakkoyun.mainpackage;

class Employee {
  float salary;
  Address address; // Aggregation (HAS-A relationship) (Employee HAS-A Address)

  Employee() {
    salary = 4000;
    address = new Address("San Francisco", "California", "US");
  }
}
