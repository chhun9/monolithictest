package com.example.monolithic.entity;

import com.example.monolithic.common.code.EngineFuel;
import com.example.monolithic.common.code.UsageStatus;
import com.example.monolithic.dto.EngineDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Engine {
    @Id
    private Long engineId;
    private String engineName;
    private String enginePower;
    @Enumerated(EnumType.STRING)
    private EngineFuel engineFuel;
    private String engineVendor;
    @Enumerated(EnumType.STRING)
    private UsageStatus engineStatus;

    public static Engine getEngineFromEngineDTO(EngineDTO engineDTO) {
        return new Engine(engineDTO.engineId(), engineDTO.engineName(), engineDTO.enginePower(), engineDTO.engineFuel(), engineDTO.engineVendor(), engineDTO.engineStatus());
    }
}