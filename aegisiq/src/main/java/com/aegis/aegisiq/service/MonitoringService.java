package com.aegis.aegisiq.service;


import org.springframework.stereotype.Service;

import com.aegis.aegisiq.entity.Asset;
import com.aegis.aegisiq.repository.AssetRepository;
import com.aegis.aegisiq.dto.MonitoringResponse;


import java.util.List;
import java.util.stream.Collectors;


@Service
public class MonitoringService {


    private final AssetRepository assetRepository;


    public MonitoringService(AssetRepository assetRepository){
        this.assetRepository = assetRepository;
    }



    public List<MonitoringResponse> getMonitoringData(){


        List<Asset> assets = assetRepository.findAll();


        return assets.stream()
                .map(asset -> {


                    String health;


                    if(asset.getCpuUsage() > 90 
                       || asset.getMemoryUsage() > 90){

                        health = "CRITICAL";

                    }
                    else if(asset.getCpuUsage() > 70 
                            || asset.getMemoryUsage() > 70){

                        health = "WARNING";

                    }
                    else{

                        health = "GOOD";

                    }



                    return new MonitoringResponse(
                            asset.getId(),
                            asset.getAssetName(),
                            asset.getCpuUsage(),
                            asset.getMemoryUsage(),
                            health
                    );

                })
                .collect(Collectors.toList());

    }

}