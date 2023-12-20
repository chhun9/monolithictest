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
import org.springframework.core.ParameterizedTypeReference;
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
        ResponseEntity<List<BodyDTO>> res = new RestTemplate()
                .exchange(urlHolder.getBodyMock(), HttpMethod.GET, null,
                        new ParameterizedTypeReference<>() {});

        List<Body> bodies = res.getBody().stream().map(bodyDTO ->
                new Body(bodyDTO.bodyId(), bodyDTO.bodyName(), bodyDTO.bodyColor(), bodyDTO.bodyStyle(), bodyDTO.bodyVendor(), bodyDTO.bodyStatus())
        ).toList();
        return bodies;
    }

    private List<Engine> insertDataEngine() {
        ResponseEntity<List<EngineDTO>> res = new RestTemplate()
                .exchange(urlHolder.getBodyMock(), HttpMethod.GET, null,
                        new ParameterizedTypeReference<>() {});

        List<Engine> engines = res.getBody().stream().map(engineDTO ->
                new Engine(engineDTO.engineId(), engineDTO.engineName(), engineDTO.enginePower(), engineDTO.engineFuel(), engineDTO.engineVendor(), engineDTO.engineStatus())
        ).toList();
        return engines;
    }

    private List<Wheel> insertDataWheel() {
        ResponseEntity<List<WheelDTO>> res = new RestTemplate()
                .exchange(urlHolder.getBodyMock(), HttpMethod.GET, null,
                        new ParameterizedTypeReference<>() {});

        List<Wheel> wheels = res.getBody().stream().map(wheelDTO ->
                new Wheel(wheelDTO.wheelId(), wheelDTO.wheelName(), wheelDTO.wheelColor(), wheelDTO.wheelSize(), wheelDTO.wheelVendor(), wheelDTO.wheelStatus())
        ).toList();
        return wheels;
    }

}