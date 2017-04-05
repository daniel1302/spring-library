package edu.pk.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/book")
public class BookController {


	@RequestMapping("/index")
    public String index() {
        return "book/index";
    }
}
