package com.example.helmetproject.service;

import com.example.helmetproject.dto.ShockSensor;
import com.example.helmetproject.dto.WearingSensor;
import com.example.helmetproject.mapper.SensorMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SensorService {

    private final SensorMapper sensorMapper;
    LocalDate localDate = LocalDate.now();

    public SensorService(SensorMapper sensorMapper) {
        this.sensorMapper = sensorMapper;
    }

    public void shockSensor(ShockSensor shockSensor){
       sensorMapper.shockSensor(shockSensor);
    }

    public void wearingSensor(WearingSensor wearingSensor){
        wearingSensor.setDate(localDate);
        sensorMapper.wearingSensor(wearingSensor);
    }
}
