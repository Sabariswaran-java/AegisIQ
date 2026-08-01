package com.aegis.aegisiq.decision;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DecisionTwinController {

    private final DecisionTwinService service;

    public DecisionTwinController(DecisionTwinService service) {
        this.service = service;
    }

    @GetMapping("/api/decision")
    public Map<String, Object> getDecision() {
        return service.simulateDecision();
    }

}