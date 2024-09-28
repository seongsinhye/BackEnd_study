package com.example.Backend_Testing.controller;

import com.example.Backend_Testing.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Tag(name = "메인", description = "메인 API")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
@Slf4j
public class MainController {
    MainService mainService;

    @GetMapping("/")
    @Operation(summary = "테스트", description = "API가 정상적으로 동작되는지 확인하는 주소입니다.")
    public String test(){
        log.info("test");
        return "test";
    }


    @GetMapping("/test")
    public int hello() {
        return mainService.test();
    }
}
