package com.example.monolithic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class KafkaLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long kafkaLogSeq;
    private String topic;
    private String messageKey;
    private String messageValue;
}
