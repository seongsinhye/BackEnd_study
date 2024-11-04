package com.example.Backend_Testing.service;

import com.example.Backend_Testing.mapper.MainMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@AllArgsConstructor
public class MainService {
    MainMapper mainMapper;
    public HashMap<String, Object> test(){return mainMapper.test();}
}
