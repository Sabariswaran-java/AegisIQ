package com.aegis.aegisiq.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.aegis.aegisiq.entity.Dependency;
import com.aegis.aegisiq.service.DependencyService;


@RestController
@RequestMapping("/api/dependencies")
@CrossOrigin
public class DependencyController {


    private final DependencyService dependencyService;


    public DependencyController(DependencyService dependencyService) {
        this.dependencyService = dependencyService;
    }



    
    @GetMapping("/{assetId}")
    public List<Dependency> getDependencies(
            @PathVariable Long assetId) {

        return dependencyService.getDependencies(assetId);
    }



 
    @PostMapping
    public Dependency addDependency(
            @RequestBody Dependency dependency) {

        return dependencyService.saveDependency(dependency);
    }



    
    @DeleteMapping("/{id}")
    public String deleteDependency(
            @PathVariable Long id) {

        dependencyService.deleteDependency(id);

        return "Dependency deleted successfully";
    }

}