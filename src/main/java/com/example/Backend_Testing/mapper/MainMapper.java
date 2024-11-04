package com.example.Backend_Testing.mapper;


import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MainMapper {
    public HashMap<String, Object> test();
}
