package pers.xzj.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Controller5 {
    /**
     * 必须要参数保持一定
     * @param id
     * @param name
     * @return
     */
    @PostMapping("/t1")
    public String test1(Integer id,String name){
        System.out.println(id+name);
        return "success";
    }

    @GetMapping("/t2/{name}")
    public String test2(@PathVariable("name") String name){
        System.out.println(name);
        return "success";
    }


    @GetMapping("/t3")
    public String test3(@RequestHeader("User-Agent") String name){
        return name;
    }

    @GetMapping("/session")
    public String test4(HttpServletRequest request,HttpServletResponse response){

        request.getSession().setAttribute("user","xzj");
        Cookie cookie = new Cookie("user", "xzj");
        response.addCookie(cookie);
        return "success";
    }

    @GetMapping("/t4")
    public String test5(@CookieValue("user") String user){
        return user;
    }

}
