package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("test")
class UserControl {

    @RequestMapping("xx")
    @ResponseBody
    fun myout(): String {
        return "hello"
    }
}