package com.aegis.aegisiq.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aegis.aegisiq.entity.Asset;
import com.aegis.aegisiq.repository.AssetRepository;

@Service
public class AssetService {

    private final AssetRepository assetRepository;

    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }


    // Create Asset
    public Asset createAsset(Asset asset) {
        return assetRepository.save(asset);
    }


    // Get All Assets
    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }


    // Get Asset By Id
    public Asset getAssetById(Long id) {
        return assetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Asset not found"));
    }


    // Delete Asset
    public void deleteAsset(Long id) {
        assetRepository.deleteById(id);
    }
}