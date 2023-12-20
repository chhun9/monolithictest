package com.example.monolithic.entity;

import com.example.monolithic.common.code.BodyStyle;
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
public class Body {
    @Id
    private Long bodyId;
    private String bodyName;
    private String bodyColor;
    @Enumerated(EnumType.STRING)
    private BodyStyle bodyStyle;
    private String bodyVendor;
    @Enumerated(EnumType.STRING)
    private UsageStatus bodyStatus;
}
