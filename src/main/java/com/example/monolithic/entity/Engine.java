package com.example.monolithic.entity;

import com.example.monolithic.common.code.EngineFuel;
import com.example.monolithic.common.code.UsageStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
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
}