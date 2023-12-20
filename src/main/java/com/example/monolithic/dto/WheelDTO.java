package com.example.monolithic.dto;

import com.example.monolithic.common.code.UsageStatus;

public record WheelDTO(
        Long wheelId,
        String wheelName,
        String wheelColor,
        String wheelSize,
        String wheelVendor,
        UsageStatus wheelStatus
) {
}