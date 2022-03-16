package com.example.helmetproject.service;

import com.example.helmetproject.dto.Helmet;
import com.example.helmetproject.mapper.HelmetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelmetService {

    private final HelmetMapper helmetMapper;

    @Autowired
    public HelmetService(HelmetMapper helmetMapper) {
        this.helmetMapper = helmetMapper;
    }

    public void InfoInsert(Helmet helmet){
        helmetMapper.infoInsert(helmet);
    }

}
