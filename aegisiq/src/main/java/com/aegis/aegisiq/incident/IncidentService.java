package com.aegis.aegisiq.incident;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class IncidentService {

    public List<Map<String, Object>> getIncidentHistory() {

        List<Map<String, Object>> history = new ArrayList<>();

        Map<String, Object> incident = new HashMap<>();

        incident.put("incidentId", "INC-102");
        incident.put("asset", "MRI Machine");
        incident.put("problem", "CPU Usage exceeded 95%");
        incident.put("solution", "Shifted workload to Backup Server");
        incident.put("resolutionTime", "8 Minutes");
        incident.put("status", "Resolved");

        history.add(incident);

        return history;
    }
}