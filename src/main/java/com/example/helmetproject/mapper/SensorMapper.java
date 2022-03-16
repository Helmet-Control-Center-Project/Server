package com.example.helmetproject.mapper;

import com.example.helmetproject.dto.ShockSensor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SensorMapper {
    void shockSensor(ShockSensor shockSensor);
}
