package org.authorizationserverr.tacocloud.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/demo")
    public  Authentication democontroller(Authentication authentication){
        return authentication;
    }
}
//heres the controller