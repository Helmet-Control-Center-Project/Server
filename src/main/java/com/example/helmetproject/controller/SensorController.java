package com.example.helmetproject.controller;

import com.example.helmetproject.dto.ShockSensor;
import com.example.helmetproject.service.SensorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @PostMapping("http://125.177.137.35:8080")
    public ShockSensor shockSensor(@RequestBody ShockSensor data){
        sensorService.shockSensor(data);
        return data;
    }
}
