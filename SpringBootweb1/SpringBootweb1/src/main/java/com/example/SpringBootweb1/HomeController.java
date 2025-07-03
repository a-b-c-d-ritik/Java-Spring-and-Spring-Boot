package com.example.SpringBootweb1;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("home called");
        return "index.jsp";
    }

    /*
    @RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session) {
        int n1= Integer.parseInt(req.getParameter("num1"));
        int n2= Integer.parseInt(req.getParameter("num2"));
        int result=n1+n2;
        System.out.println(result);
        session.setAttribute("Sum=",result);
        return "return.jsp";
    }
    */
    /*
    @RequestMapping("add")
    public String add(@RequestParam("n1") int n1, @RequestParam("n2") int n2, HttpSession session) {

        int result=n1+n2;
        System.out.println(result);
        session.setAttribute("Sum=",result);
        return "return.jsp";
    }
*/
    //Model Object
/*
    @RequestMapping("add")
    public String add(@RequestParam("n1") int n1, @RequestParam("n2") int n2, Model model) {
        int result=n1+n2;
        System.out.println(result);
        model.addText("Sum="+result);
        return "return";
    }
*/

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("n1") int n1, @RequestParam("n2") int n2, ModelAndView mv) {
        int result=n1+n2;
        System.out.println(result);

        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;

    }



}
