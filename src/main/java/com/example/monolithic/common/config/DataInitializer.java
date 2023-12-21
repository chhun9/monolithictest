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
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@RequiredArgsConstructor
@Transactional
public class DataInitializer implements CommandLineRunner {

    @Value("${random-insert.data}")
    private boolean isInsertData;

    private final UrlHolder urlHolder;
    private final BodyRepository bodyRepository;
    private final EngineRepository engineRepository;
    private final WheelRepository wheelRepository;

    @Override
    public void run(String... args) throws Exception {
        if (isInsertData) {
            insertDataBody();
            insertDataEngine();
            insertDataWheel();
        }
    }

    private List<Body> insertDataBody() {
        List<BodyDTO> bodyMockData = getMockData(urlHolder.getBodyMock() + "/get-info", BodyDTO.class);
        return insertData(bodyMockData, BodyDTO::bodyId, Body::getBodyFromBodyDTO, bodyRepository);
    }

    private List<Engine> insertDataEngine() {
        List<EngineDTO> engineMockData = getMockData(urlHolder.getEngineMock() + "/get-info", EngineDTO.class);
        return insertData(engineMockData, EngineDTO::engineId, Engine::getEngineFromEngineDTO, engineRepository);
    }

    private List<Wheel> insertDataWheel() {
        List<WheelDTO> wheelMockData = getMockData(urlHolder.getWheelMock() + "/get-info", WheelDTO.class);
        return insertData(wheelMockData, WheelDTO::wheelId, Wheel::getWheelFromWheelDTO, wheelRepository);
    }

    private <T> List<T> getMockData(String url, Class<T> responseType) {
        ResponseEntity<List<T>> responseEntity = new RestTemplate().exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<>() {
        });
        return responseEntity.getBody().stream().map(res -> new ObjectMapper().convertValue(res, responseType)).toList();
    }

    private <T, R> List<R> insertData(List<T> dtoList, Function<T, ?> idExtractor, Function<T, R> entityMapper, JpaRepository<R, ?> repository) {
        List<R> entities = dtoList.stream()
                .collect(Collectors.toMap(
                        idExtractor,
                        entityMapper,
                        (existing, replacement) -> existing
                ))
                .values().stream().toList();

        repository.saveAll(entities);
        return entities;
    }
}