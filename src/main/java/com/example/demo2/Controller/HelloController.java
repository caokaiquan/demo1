package com.example.demo2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController
{
    /**
     * @return
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello()
    {
        return "dsfsd";
    }

    @RequestMapping("/test")
    public String hello2(Model model)
    {
//        model.addAttribute("dd",);fdsfsd
        model.addAttribute("data", 123);
        return "success";
    }





//    Date b = new Date();
}
