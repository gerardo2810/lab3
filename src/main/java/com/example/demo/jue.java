package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class jue {
    @Controller
    public class juego {
        @GetMapping("/patito_hule")
        public String patitos() {
            return "/patito_hule";
        }
    }
}
