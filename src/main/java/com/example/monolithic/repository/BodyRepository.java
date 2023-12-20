package com.example.monolithic.repository;

import com.example.monolithic.entity.Body;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodyRepository extends JpaRepository<Long, Body> {
}
