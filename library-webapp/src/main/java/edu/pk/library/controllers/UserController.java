package edu.pk.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/index")
    public String index() {
        return "user/index";
    }
}
