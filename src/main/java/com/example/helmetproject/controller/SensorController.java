package com.example.helmetproject.controller;

import com.example.helmetproject.dto.ShockSensor;
import com.example.helmetproject.dto.WearingSensor;
import com.example.helmetproject.service.SensorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sensor")
public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    /* 작업 완료 */
    @PostMapping("/wearing")
    public void wearingSensor(
            @RequestBody WearingSensor wearingSensor){
        sensorService.wearingSensor(wearingSensor);
    }

    /* 작업 완료 */
    @PostMapping("/shockSensor")
    public void shockSensor(
            @RequestBody ShockSensor shockSensor){
        sensorService.shockSensor(shockSensor);
    }

    /* 작업 미완료 */
    @GetMapping("/shockSensor")
    public ShockSensor getShockData(){

        /* 데이터 수정 필요 */
        ShockSensor shockSensor = null;
        return shockSensor;
    }




}
