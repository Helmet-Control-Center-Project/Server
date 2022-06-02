package com.example.helmetproject.controller;

import com.example.helmetproject.dto.WorkUserDto;
import com.example.helmetproject.service.WorkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkController {

    private final WorkService workService;

    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    @PostMapping("/worker")
    public void inputWorker(@RequestBody WorkUserDto workUserDto){
        workService.inputWorker(workUserDto);
    }

    @GetMapping("/worker")
    public List<WorkUserDto> getWorker(){
        return workService.getWorker();
    }

    @GetMapping("/worker/delete/{helmetId}")
    public void workerDelete(@PathVariable("helmetId")String helmetId){
        workService.deleteWorker(helmetId);
    }
}
