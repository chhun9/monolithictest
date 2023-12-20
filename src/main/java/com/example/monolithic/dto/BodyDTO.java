package com.example.monolithic.dto;

import com.example.monolithic.common.code.BodyStyle;
import com.example.monolithic.common.code.UsageStatus;
import lombok.Getter;

@Getter
public class BodyDTO {
    private Long body_id;
    private String body_name;
    private String body_color;
    private BodyStyle body_style;
    private String body_vendor;
    private UsageStatus body_status;
}
