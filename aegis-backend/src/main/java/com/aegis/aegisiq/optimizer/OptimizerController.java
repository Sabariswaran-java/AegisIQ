package com.aegis.aegisiq.optimizer;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OptimizerController {

    private final OptimizerService service;

    public OptimizerController(OptimizerService service) {
        this.service = service;
    }

    @GetMapping("/api/optimizer")
    public Map<String, Object> optimize() {
        return service.optimizeDeployment();
    }
}