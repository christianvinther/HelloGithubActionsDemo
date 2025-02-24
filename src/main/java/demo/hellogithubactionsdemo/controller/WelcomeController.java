package demo.hellogithubactionsdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    // Remove @ResponseBody
    public String welcome() {
        return "welcome"; // This will look for welcome.html template
    }
}
