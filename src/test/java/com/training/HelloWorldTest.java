package com.training;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
	private HelloWorld helloWorld = new HelloWorld();
	@Test
  	public void greeterSaysHello() {
    		assertThat(helloWorld.sayHelloWorld(), containsString("Hello World"));
  	}
}
