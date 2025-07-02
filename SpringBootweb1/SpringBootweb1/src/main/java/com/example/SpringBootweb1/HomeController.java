package com.example.SpringBootweb1;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("home called");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest req) {
        int n1= Integer.parseInt(req.getParameter("num1"));
        int n2= Integer.parseInt(req.getParameter("num2"));
        int result=n1+n2;
        System.out.println(result);
        return "return.jsp";
    }
}
