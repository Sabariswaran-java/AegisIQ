package com.aegis.aegisiq.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.aegis.aegisiq.entity.Asset;
import com.aegis.aegisiq.service.AssetService;

@RestController
@RequestMapping("/api/assets")
public class AssetController {

    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }


    // Create Asset
    @PostMapping
    public Asset createAsset(@RequestBody Asset asset) {
        return assetService.createAsset(asset);
    }


    // Get All Assets
    @GetMapping
    public List<Asset> getAllAssets() {
        return assetService.getAllAssets();
    }


    // Get Asset By Id
    @GetMapping("/{id}")
    public Asset getAssetById(@PathVariable Long id) {
        return assetService.getAssetById(id);
    }


    // Delete Asset
    @DeleteMapping("/{id}")
    public String deleteAsset(@PathVariable Long id) {
        assetService.deleteAsset(id);
        return "Asset deleted successfully";
    }
}