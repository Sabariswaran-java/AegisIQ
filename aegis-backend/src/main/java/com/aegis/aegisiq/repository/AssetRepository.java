package com.aegis.aegisiq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aegis.aegisiq.entity.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long> {

}