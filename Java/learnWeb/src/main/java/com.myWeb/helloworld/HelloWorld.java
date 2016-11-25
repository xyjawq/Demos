package com.myWeb.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloWorld{
    @RequestMapping(value = "sayHello")
    public @ResponseBody String sayHello(HttpServletRequest request, HttpServletResponse response, ModelMap m){

        return "Hello World!";
    }

//    public static void main(String argv[]){
//        System.out.println(new HelloWorld().sayHello());
//    }
}