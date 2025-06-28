package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
  private String name;
  private String HKid;
  private String email;

  public static void main(String[] args) {
    Staff s1 = Staff.builder()
      .name("John")
      .HKid("H123567")
      .email("john@gmail.com")
      .build();
      System.out.println(s1);
  }
}
