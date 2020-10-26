package com.tomoloyalty.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("test")
    fun test(): String {
        val message = "Hello Kotlin!!"
        print(message)
        return message
    }
}