package com.projecthelloworld.helloworld.controller;
import com.projecthelloworld.helloworld.model.HelloWorld;
import com.projecthelloworld.helloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")


@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String sayHelloWorld(){
//        return helloWorldService.sayHelloService();
//    }

    @GetMapping("/hello")
    public @ResponseBody HelloWorld getMessage(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage(helloWorldService.sayHelloService());
        return helloWorld;
    }
}
