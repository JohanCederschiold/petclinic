package se.jpdc.pets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import se.jpdc.pets.service.VetService;

@Controller
public class VetController {

    private final VetService service;

    public VetController(VetService service) {
        this.service = service;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", service.findAll());
        return "vets/index";
    }
}
