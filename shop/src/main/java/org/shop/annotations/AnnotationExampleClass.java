package org.shop.annotations;

public class AnnotationExampleClass {

  @InjectRandomInt(minValue = 1, maxValue = 255)
  private int randomValue = 0;

  int getRandomValue() {
    return randomValue;
  }
}
