package com.aegis.aegisiq.explain;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExplainController {

    private final ExplainService service;

    public ExplainController(ExplainService service) {
        this.service = service;
    }

    @GetMapping("/api/explain")
    public Map<String, Object> explain() {
        return service.explainDecision();
    }
}