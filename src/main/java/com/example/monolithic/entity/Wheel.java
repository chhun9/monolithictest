package com.example.monolithic.entity;

import com.example.monolithic.common.code.UsageStatus;
import com.example.monolithic.dto.WheelDTO;
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
public class Wheel {
    @Id
    private Long wheelId;
    private String wheelName;
    private String wheelColor;
    private String wheelSize;
    private String wheelVendor;
    @Enumerated(EnumType.STRING)
    private UsageStatus wheelStatus;

    public static Wheel getWheelFromWheelDTO(WheelDTO wheelDTO) {
        return new Wheel(wheelDTO.wheelId(), wheelDTO.wheelName(), wheelDTO.wheelColor(), wheelDTO.wheelSize(), wheelDTO.wheelVendor(), wheelDTO.wheelStatus());
    }
}
