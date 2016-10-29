package com.expanion.cgpa.calculator;



import com.expanion.cgpa.calculator.resources.CGPAResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class CgpaCalculatorApplication extends Application<CgpaCalculatorConfiguration> {

  @Override
  public void run(CgpaCalculatorConfiguration configuration, Environment environment) throws Exception {

      // Resources
      environment.jersey().register(CGPAResource.class);
      
  }
  
  public static void main(String[] args) throws Exception {
    new CgpaCalculatorApplication().run(args[0], args[1]);
}
}
