package info.revenberg.loader.controller;

import info.revenberg.loader.SpringBatchLoaderApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestartController {
     
    @RequestMapping("/restart")
    public void restart() {
        SpringBatchLoaderApplication.restart();        
    } 
}