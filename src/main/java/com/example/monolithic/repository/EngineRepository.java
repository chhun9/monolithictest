package com.example.monolithic.repository;

import com.example.monolithic.entity.Engine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineRepository extends JpaRepository<Long, Engine> {
}
