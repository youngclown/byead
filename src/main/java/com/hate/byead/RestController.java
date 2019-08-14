package com.hate.byead;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/{path}")
    public String noAdBye() {
        return " ";
    }

    @GetMapping("/{path}/{path}")
    public String noAdByeTwoDept() {
        return " ";
    }

    @GetMapping("/{path}/{path}/{path}")
    public String noAdByeThreeDept() {
        return " ";
    }

}
