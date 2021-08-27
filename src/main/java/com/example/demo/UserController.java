package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private Ihr ihr;
    @RequestMapping("hr")
   @ResponseBody
    public List<Hr> findHr(){
        List<Hr> list=ihr.findHr();
        return list;
    }
}
