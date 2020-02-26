package com.ssg.jenkins.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {


    @RequestMapping("/jenkins")
    public String k8s(){
        return "hello jenkins ssg";
    }
}
