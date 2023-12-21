package com.example.monolithic.entity;

import com.example.monolithic.common.code.BodyStyle;
import com.example.monolithic.common.code.UsageStatus;
import com.example.monolithic.dto.BodyDTO;
import com.example.monolithic.dto.EngineDTO;
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

    public static Body getBodyFromBodyDTO(BodyDTO bodyDTO) {
        return new Body(bodyDTO.bodyId(), bodyDTO.bodyName(), bodyDTO.bodyColor(), bodyDTO.bodyStyle(), bodyDTO.bodyVendor(), bodyDTO.bodyStatus());
    }
}
