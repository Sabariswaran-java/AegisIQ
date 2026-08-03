package com.aegis.aegisiq.controller;


import org.springframework.web.bind.annotation.*;

import com.aegis.aegisiq.dto.MonitoringResponse;
import com.aegis.aegisiq.service.MonitoringService;


import java.util.List;


@RestController
@RequestMapping("/api/monitoring")
@CrossOrigin
public class MonitoringController {



    private final MonitoringService monitoringService;



    public MonitoringController(MonitoringService monitoringService){

        this.monitoringService = monitoringService;

    }



    @GetMapping
    public List<MonitoringResponse> getMonitoring(){

        return monitoringService.getMonitoringData();

    }

}