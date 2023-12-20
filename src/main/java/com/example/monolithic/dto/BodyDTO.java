package com.example.monolithic.dto;

import com.example.monolithic.common.code.BodyStyle;
import com.example.monolithic.common.code.UsageStatus;

public record BodyDTO(
        Long bodyId,
        String bodyName,
        String bodyColor,
        BodyStyle bodyStyle,
        String bodyVendor,
        UsageStatus bodyStatus
) {
}
