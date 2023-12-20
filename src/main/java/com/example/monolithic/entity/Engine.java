package com.example.monolithic.entity;

import com.example.monolithic.common.code.EngineFuel;
import com.example.monolithic.common.code.UsageStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Engine {
    @Id
    private Long engine_id;
    private String engine_name;
    private String engine_powert;
    @Enumerated(EnumType.STRING)
    private EngineFuel engine_fuel;
    private String engine_vendor;
    @Enumerated(EnumType.STRING)
    private UsageStatus engine_status;
}