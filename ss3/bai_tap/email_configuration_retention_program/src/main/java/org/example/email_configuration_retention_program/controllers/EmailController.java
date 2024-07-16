package org.example.email_configuration_retention_program.controllers;

import org.example.email_configuration_retention_program.models.EmailSetting;
import org.example.email_configuration_retention_program.services.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private IEmailService emailService;

    @GetMapping
    public String index(Model model) {
        EmailSetting emailSetting = emailService.getAll();
        model.addAttribute("emailSettings", emailSetting);
        return "/home";
    }

    @GetMapping("/update")
    public String showUpdateForm(Model model) {
        EmailSetting emailSettings = emailService.getAll();
        String[] languages = new String[]{"English", "Vietnamese", "Japanese", "Chinese"};
        int[] sizes = new int[]{5, 10, 15, 25, 50, 100};
        model.addAttribute("emailSettings", emailSettings);
        model.addAttribute("languages", languages);
        model.addAttribute("sizes", sizes);
        return "update";
    }

    @PostMapping("/update")
    public String updateMailSettings(@ModelAttribute("mail") EmailSetting emailSetting) {
        emailService.save(emailSetting);
        return "redirect:/mailbox";
    }
}
