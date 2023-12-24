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
public class Workflow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long workflowSeq;
    private Long refSeq;
    private String transactionId;
    private String status;
    private String apiCode;
    @CreationTimestamp
    private LocalDateTime startDate;
    @UpdateTimestamp
    private LocalDateTime endDate;
}
