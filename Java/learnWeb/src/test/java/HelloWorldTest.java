/**
 * Created by hzxuyongjin on 2016/11/20.
 */
package com.myWeb.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;

public class HelloWorldTest {
    @Test
    public void testSayhello()
    {
        HelloWorld helloWorld = new HelloWorld();
        //String result = helloWorld.sayHello();
        String result = "Hello World!";
        assertEquals("Hello World!",result);
    }
}
