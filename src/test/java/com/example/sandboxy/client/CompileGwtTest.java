package com.example.sandboxy.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "com.example.sandboxy.Sandboxy";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}
