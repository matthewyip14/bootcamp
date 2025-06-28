package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Cat extends Animal{
  private String name;
  private int age;
  private Calculator calculator;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public Cat(String name, int age, double weight) {
    super(weight);
    this.name = name;
    this.age = age;
  }

  public Cat(String name, int age, double weight, Calculator calculator) {
    super(weight);
    this.name = name;
    this.age = age;
    this.calculator = calculator;
  }

  public int subtract(int a, int x, int y) {
    return a - this.calculator.sum(x, y);
  }

  public int sum(int x, int y) {
    return x * y;
  }
  public String sum1(String name, int x, int y) {
    return name + sum2(x, y);
  }

  public int sum2(int x, int y) {
    return x + y;
  }
  public static void main(String[] args) {
    Cat cat1 = new Cat("John", 2, 11.1);
    Cat cat2 = new Cat();

    System.out.println(cat1.getAge());
    System.out.println(cat1.getName());
    System.out.println(cat1);
    
    cat2.setAge(7);
    cat2.setName("Peter");;
    System.out.println(cat2);

    Cat cat3 = new Cat("John", 2, 11.1);
    System.out.println(cat1.equals(cat3));
    System.out.println(cat1.hashCode() == cat3.hashCode());

  }
}
