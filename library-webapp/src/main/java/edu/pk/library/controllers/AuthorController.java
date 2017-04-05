package edu.pk.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/author")
public class AuthorController {
	@RequestMapping("/index")
    public String index() {
        return "author/index";
    }

    @RequestMapping("/hello/{imie}")
    public String hello(@PathVariable("imie") String imie) {
        return "hello";
    }
}
