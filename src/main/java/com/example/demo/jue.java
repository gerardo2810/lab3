package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class jue {
    /*@GetMapping("/patito_hule"){
        public String patitos(@RequestParam("fila") String fila,
                              @RequestParam("columna") String columna,
                              @RequestParam("iniciales") String inicales,
                              @RequestParam("fotos") String columnas) {
            return "/patito_hule";
        }
    }

    @GetMapping("/patito_hule/play")
    public class play {
        @GetMapping("/patito_hule/play")
        public String patitos1() {
            return "/patito_hule/play";
        }
    }*/
    @GetMapping("/patito_hule")
    public String patitos() {
        return "/patito_hule";
    }

}
