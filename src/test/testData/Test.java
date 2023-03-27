package com.github.musinapolina.urlhashcodeinspectionplugin

import java.io.IOException;
import java.net.URL;

class MyClass {
  public int hashCode() {
    return 0;
  }
}

public class Main {
  public static void main(String[] args) {
    MyClass my = new MyClass();
    System.out.println(my.hashCode());

    try {
      URL url = new URL("http://www.java2s.com");
      System.out.println("URL is " + <caret>url.hashCode());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
