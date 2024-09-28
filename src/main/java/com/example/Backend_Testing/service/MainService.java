package com.example.Backend_Testing.service;

import com.example.Backend_Testing.mapper.MainMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MainService {
    MainMapper mainMapper;
    public int test(){return mainMapper.test();}
}
