package com.example.monolithic.common.config;

import com.example.monolithic.dto.BodyDTO;
import com.example.monolithic.dto.EngineDTO;
import com.example.monolithic.dto.WheelDTO;
import com.example.monolithic.entity.Body;
import com.example.monolithic.entity.Engine;
import com.example.monolithic.entity.Wheel;
import com.example.monolithic.repository.BodyRepository;
import com.example.monolithic.repository.EngineRepository;
import com.example.monolithic.repository.WheelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    @Value("${random.insert.data}")
    private boolean isInsertData;

    private final UrlHolder urlHolder;
    private final BodyRepository bodyRepository;
    private final EngineRepository engineRepository;
    private final WheelRepository wheelRepository;

    @Override
    public void run(String... args) throws Exception {
        if (isInsertData) {

        }
    }

    private List<Body> insertDataBody() {
        ResponseEntity<BodyDTO> response = new RestTemplate().exchange(urlHolder.getBodyMock(), HttpMethod.GET, null, BodyDTO.class);
        return null;
    }

    private List<Engine> insertDataEngine() {
        ResponseEntity<EngineDTO> response = new RestTemplate().exchange(urlHolder.getEngineMock(), HttpMethod.GET, null, EngineDTO.class);
        return null;
    }

    private List<Wheel> insertDataWheel() {
        ResponseEntity<WheelDTO> response = new RestTemplate().exchange(urlHolder.getWheelMock(), HttpMethod.GET, null, WheelDTO.class);
        return null;
    }

}