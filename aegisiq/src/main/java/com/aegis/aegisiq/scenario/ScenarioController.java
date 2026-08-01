package com.aegis.aegisiq.scenario;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScenarioController {

    private final ScenarioService service;

    public ScenarioController(ScenarioService service){
        this.service = service;
    }

    @GetMapping("/api/scenario")
    public List<Map<String,Object>> getScenario(){

        return service.getScenarios();
    }

}