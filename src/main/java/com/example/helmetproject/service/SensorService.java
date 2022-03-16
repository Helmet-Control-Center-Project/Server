package com.example.helmetproject.service;

import com.example.helmetproject.dto.ShockSensor;
import com.example.helmetproject.mapper.SensorMapper;
import org.springframework.stereotype.Service;

@Service
public class SensorService {

    private final SensorMapper sensorMapper;

    public SensorService(SensorMapper sensorMapper) {
        this.sensorMapper = sensorMapper;
    }

    public void shockSensor(ShockSensor shockSensor){
       sensorMapper.shockSensor(shockSensor);
    }
}
