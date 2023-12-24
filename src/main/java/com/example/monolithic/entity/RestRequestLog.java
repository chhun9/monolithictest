package com.example.monolithic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class RestRequestLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long restRequestLogSeq;
    private String method;
    private String uri;
    private String requestHeader;
    private String requestBody;
    private String responseBody;
    private String status;
    @CreationTimestamp
    private LocalDateTime startDate;
    @UpdateTimestamp
    private LocalDateTime endDate;
}
