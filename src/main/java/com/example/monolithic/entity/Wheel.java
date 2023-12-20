package com.example.monolithic.entity;

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
public class Wheel {
    @Id
    private Long wheel_id;
    private String wheel_name;
    private String wheel_color;
    private String wheel_size;
    private String wheel_vendor;
    @Enumerated(EnumType.STRING)
    private UsageStatus wheel_status;
}
