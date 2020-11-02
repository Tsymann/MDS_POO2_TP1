package com.tactfactory.javaniveau2.tps.tp1.utils;

import java.util.Random;

public class StringUtils {

  public static String randomString(int minChar, int maxChar) {
    StringBuilder result = new StringBuilder();
    Random rand = new Random();
    int nbEl = (rand.nextInt(maxChar - minChar) % maxChar) + minChar;

    for (int i = 0; i < nbEl; i++) {
      result.append((char)((rand.nextInt(26) % 26) + 97));
    }

    return result.toString();
  }
}
