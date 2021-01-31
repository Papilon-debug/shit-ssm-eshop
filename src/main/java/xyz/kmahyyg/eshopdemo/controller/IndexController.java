package xyz.kmahyyg.eshopdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @GetMapping(value="/")
    @ResponseBody
    public String showIndex(){
        return "index";
    }
}
