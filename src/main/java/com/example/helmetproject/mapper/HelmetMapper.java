package com.example.helmetproject.mapper;

import com.example.helmetproject.dto.Helmet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelmetMapper {

    //helmet 데이터 추가
    void infoInsert(Helmet helmet);

}
