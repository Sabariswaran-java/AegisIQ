package com.aegis.aegisiq.incident;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncidentController {

    private final IncidentService service;

    public IncidentController(IncidentService service) {
        this.service = service;
    }

    @GetMapping("/api/incidents")
    public List<Map<String, Object>> getIncidents() {
        return service.getIncidentHistory();
    }
}