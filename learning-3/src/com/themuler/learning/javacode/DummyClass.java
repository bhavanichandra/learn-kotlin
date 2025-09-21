package com.themuler.learning.javacode;

public class DummyClass {

  public String isVacationTime(boolean onVacation) {
    return onVacation ? "Vacation Time" : "Working";
  }

  public String isVacationTimeWithBoolean(Boolean onVacation) {
    return onVacation ? "Vacation Time" : "Working";
  }

  public void printNumbers(int[] numbers) {
    for (int number : numbers) {
      System.out.println(number);
    }
  }

}
