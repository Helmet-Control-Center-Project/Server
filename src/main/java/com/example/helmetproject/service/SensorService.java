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

    public ShockSensor shockSensor(ShockSensor shockSensor){
       return sensorMapper.shockSensor(shockSensor);
    }
}
