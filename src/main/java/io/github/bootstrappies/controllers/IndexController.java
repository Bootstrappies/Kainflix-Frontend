package io.github.bootstrappies.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Corinna on 08.03.2016.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    String index()
    {
        return "index";
    }
}
