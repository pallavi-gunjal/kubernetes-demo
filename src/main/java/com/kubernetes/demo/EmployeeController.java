package com.kubernetes.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

//    @Lazy
    @Autowired
    EmployeeService lazyService;

    @GetMapping
    public String hello() {
        return lazyService.hello();
    }
}
