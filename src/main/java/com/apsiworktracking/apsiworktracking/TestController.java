package com.apsiworktracking.apsiworktracking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{

    @GetMapping("/test")
    public String test()
    {
        return "Hello Github Action";
    }

    @GetMapping("/test2/{first}/{second}")
    public String test2(@PathVariable int first, @PathVariable int second)
    {
        return first + " + " + second + " = " + (first + second);
    }
}
