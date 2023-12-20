package com.example.monolithic.dto;

import com.example.monolithic.common.code.EngineFuel;
import com.example.monolithic.common.code.UsageStatus;

public record EngineDTO(
        Long engineId,
        String engineName,
        String enginePower,
        EngineFuel engineFuel,
        String engineVendor,
        UsageStatus engineStatus
) {
}