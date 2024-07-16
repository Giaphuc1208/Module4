package org.example.chuyendoitiente;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverterController {
    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam("rate") double rate,
                          @RequestParam("usd") double usd,
                          Model model) {
        double vnd = rate * usd;
        model.addAttribute("vnd", vnd);
        return "result";
    }

}


