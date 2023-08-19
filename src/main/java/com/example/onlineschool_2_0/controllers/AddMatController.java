package com.example.onlineschool_2_0.controllers;

import com.example.onlineschool_2_0.entity.AdditionalMaterials;
import com.example.onlineschool_2_0.service.AdditionalMaterialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AddMatController {

    private final AdditionalMaterialsService additionalMaterialsService;

    @Autowired
    public AddMatController(AdditionalMaterialsService additionalMaterialsService) {
        this.additionalMaterialsService = additionalMaterialsService;
    }

    @GetMapping()
    public String getHome(Model model) {
        final List<AdditionalMaterials> additionalMaterials = additionalMaterialsService.getMaterials();
        model.addAttribute("materials", additionalMaterials);
        return "index";
    }

    @GetMapping("/materials")
    public String getMaterials(Model model) {
        final List<AdditionalMaterials> additionalMaterials = additionalMaterialsService.getMaterials();
        model.addAttribute("materials", additionalMaterials);
        return "index";
    }

    @GetMapping("/material")
    public String formForMaterials(Model model) {
        return "materialserv";
    }

    @PostMapping("/add")
    public String addMaterial(AdditionalMaterials additionalMaterials) {
        additionalMaterials.setIsAvailable(true);
        additionalMaterialsService.saveMaterials(additionalMaterials);
        return "redirect:/";
    }

}
