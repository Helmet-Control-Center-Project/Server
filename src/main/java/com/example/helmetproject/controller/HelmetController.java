package com.example.helmetproject.controller;

import com.example.helmetproject.dto.Helmet;
import com.example.helmetproject.service.HelmetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelmetController {

    private final HelmetService helmetService;

    public HelmetController(HelmetService helmetService) {
        this.helmetService = helmetService;
    }

    @PostMapping("http://125.177.137.35:8080/helmet")
    public Helmet infoInsert(@RequestBody Helmet helmet){
        helmetService.InfoInsert(helmet);
        return helmet;
    }
}