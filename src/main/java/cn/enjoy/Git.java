package cn.enjoy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Git {
    @RequestMapping("/home")
    public String home(){
        return "hello! Git";
    }
}
