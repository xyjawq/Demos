package com.myWeb.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hzxuyongjin on 2016/11/24.
 */
@Controller
public class Welcome {
    @RequestMapping(value = "welcome")
    public @ResponseBody String sayWelcome(HttpServletRequest request, HttpServletResponse response, ModelMap m){
        return "Welcome";
    }
}
