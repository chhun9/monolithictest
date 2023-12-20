package com.example.monolithic.dto;

import com.example.monolithic.common.code.UsageStatus;
import lombok.Getter;

@Getter
public class WheelDTO {
    private Long wheel_id;
    private String wheel_name;
    private String wheel_color;
    private String wheel_size;
    private String wheel_vendor;
    private UsageStatus wheel_status;
}
