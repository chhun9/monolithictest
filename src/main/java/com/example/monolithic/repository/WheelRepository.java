package com.example.monolithic.repository;

import com.example.monolithic.entity.Wheel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WheelRepository extends JpaRepository<Wheel, Long> {
}
