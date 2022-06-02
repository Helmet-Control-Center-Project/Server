package com.example.helmetproject.service;

import com.example.helmetproject.dto.WorkUserDto;
import com.example.helmetproject.mapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkService {

    private WorkMapper workMapper;

    @Autowired
    public WorkService(WorkMapper workMapper) {
        this.workMapper = workMapper;
    }

    public void inputWorker(WorkUserDto workUserDto){
        workMapper.userInputConditionUpdate(workUserDto.getHelmetId(),workUserDto.getUserId());
        workMapper.helmetInputConditionUpdate(workUserDto.getUserId(), workUserDto.getHelmetId());
        workMapper.inputWorker(workUserDto);
    }

    public void deleteWorker(String helmetId){
        workMapper.helmetDeleteConditionUpdate();
        workMapper.userDeleteConditionUpdate();
        workMapper.deleteWorker(helmetId);
    }

    public List<WorkUserDto> getWorker() {
        return workMapper.getWorker();
    }
}
