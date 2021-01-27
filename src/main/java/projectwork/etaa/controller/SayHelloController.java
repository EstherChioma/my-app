package projectwork.etaa.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {


    @RequestMapping("/hello")
    public String sayHi() {
        return "hello i am here" ;
    }


}
