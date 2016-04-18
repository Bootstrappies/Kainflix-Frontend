package io.github.bootstrappies.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/account")
    String account() {
        return "account";
    }

    @RequestMapping("/login")
    String login() {
        return "loginAndRegistry";
    }

    @RequestMapping("/basket")
    String basket() {
        return "ShoppingBasket";
    }

    @RequestMapping("/adminC")
    String adminC() {
        return "adminCustomer";
    }

    @RequestMapping("/deleteC")
    String deleteC() {
        // TODO delete sheesh
        return "adminCustomer";
    }

    @RequestMapping("/adminM")
    String adminM() {
        return "adminMovies";
    }
}
