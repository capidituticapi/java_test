package com.test.cuatro;

public class Singleton {
    private static Singleton mInstance;

    // instance variables here

    private Singleton() { }

    public static Singleton getInstance() { 
      if (mInstance == null) {
        mInstance = new Singleton(); 
      }
      return mInstance; 
    }
    
    // methods here.
}
