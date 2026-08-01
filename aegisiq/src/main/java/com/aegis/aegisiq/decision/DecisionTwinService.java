package com.aegis.aegisiq.decision;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class DecisionTwinService {

    public Map<String, Object> simulateDecision() {

        Map<String, Object> result = new HashMap<>();

        result.put("asset", "MRI Machine");
        result.put("currentCpu", 96);
        result.put("risk", "HIGH");

        result.put("recommendedAction",
                "Shift workload to Backup Server");

        result.put("predictedDowntime",
                "Reduced from 2 Hours to 10 Minutes");

        result.put("confidence", "97%");

        return result;
    }

}