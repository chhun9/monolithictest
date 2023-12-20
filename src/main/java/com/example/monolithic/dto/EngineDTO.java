package com.example.monolithic.dto;

import com.example.monolithic.common.code.EngineFuel;
import com.example.monolithic.common.code.UsageStatus;
import lombok.Getter;

@Getter
public class EngineDTO {
    private Long engine_id;
    private String engine_name;
    private String engine_powert;
    private EngineFuel engine_fuel;
    private String engine_vendor;
    private UsageStatus engine_status;


}