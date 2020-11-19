package pers.xzj.springmvc.controller;


import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/test4")
public class Controller4 {

    @RequestMapping(value = "/converter", method = RequestMethod.GET)
    @ResponseBody
    public String requestMap(Date date) {
        System.out.println(date);
        return "d";
    }
    @RequestMapping(value = "/converter", method = RequestMethod.POST)
    @ResponseBody
    public String requestMap1(Date date) {
        System.out.println(date);
        return "d1";
    }
}
