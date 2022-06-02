package com.example.helmetproject.controller;

import com.example.helmetproject.dto.ShockSensor;
import com.example.helmetproject.dto.WearingSensor;
import com.example.helmetproject.service.SensorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sensor")
public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    /* 작업 완료 */
    /* 헬멧 착용 정보 데이터 입력 */
    @PostMapping("/wearing")
    public void wearingSensor(
            @RequestBody WearingSensor wearingSensor){
        sensorService.wearingSensor(wearingSensor);
    }

    /* 작업 완료 */
    /* 충격 센서 정보 데이터 입력 */
    @PostMapping("/shockSensor")
    public void shockSensor(
            @RequestBody ShockSensor shockSensor){
        sensorService.shockSensor(shockSensor);
    }

    /* 작업 미완료 */
    /* 충격 센서 정보 불러 오기 */
//    @GetMapping("/shockSensor")
//    public ResponseEntity<ShockSensor> getShockData(){
//        ShockSensor shockSensorData = sensorService.shockSensor();
//        return ResponseEntity.status(HttpStatus.OK).body(shockSensorData());
//
//    }




}
