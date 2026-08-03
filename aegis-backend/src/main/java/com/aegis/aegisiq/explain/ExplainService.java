package com.aegis.aegisiq.explain;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ExplainService {

    public Map<String, Object> explainDecision() {

        Map<String, Object> result = new HashMap<>();

        result.put("recommendedAction", "Shift workload to Backup Server");
        result.put("reason1", "CPU usage exceeded safe threshold (96%)");
        result.put("reason2", "Backup server has sufficient capacity");
        result.put("reason3", "Similar incident was resolved successfully");
        result.put("estimatedDowntime", "10 Minutes");
        result.put("confidence", "97%");

        return result;
    }
}