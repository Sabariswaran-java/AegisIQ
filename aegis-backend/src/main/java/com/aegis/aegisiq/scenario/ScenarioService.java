package com.aegis.aegisiq.scenario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ScenarioService {

    public List<Map<String,Object>> getScenarios(){

        List<Map<String,Object>> scenarios = new ArrayList<>();

        Map<String,Object> s1 = new HashMap<>();
        s1.put("scenario","Restart Server");
        s1.put("risk","MEDIUM");
        s1.put("downtime","5 Minutes");

        Map<String,Object> s2 = new HashMap<>();
        s2.put("scenario","Shift Workload");
        s2.put("risk","LOW");
        s2.put("downtime","0 Minutes");

        Map<String,Object> s3 = new HashMap<>();
        s3.put("scenario","Do Nothing");
        s3.put("risk","CRITICAL");
        s3.put("downtime","2 Hours");

        scenarios.add(s1);
        scenarios.add(s2);
        scenarios.add(s3);

        return scenarios;
    }

}