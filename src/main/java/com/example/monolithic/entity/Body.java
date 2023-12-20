package com.example.monolithic.entity;

import com.example.monolithic.common.code.BodyStyle;
import com.example.monolithic.common.code.UsageStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Body {
    @Id
    private Long body_id;
    private String body_name;
    private String body_color;
    @Enumerated(EnumType.STRING)
    private BodyStyle body_style;
    private String body_vendor;
    @Enumerated(EnumType.STRING)
    private UsageStatus body_status;

}
