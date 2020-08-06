package by.gsu.winter20.spring_boot_demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
