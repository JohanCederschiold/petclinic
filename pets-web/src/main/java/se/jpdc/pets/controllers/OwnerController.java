package se.jpdc.pets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import se.jpdc.pets.service.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {


    private final OwnerService service;

    public OwnerController(OwnerService service) {
        this.service = service;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", service.findAll());
        return "owners/index";
    }
}
