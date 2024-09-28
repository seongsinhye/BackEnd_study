package com.example.Backend_Testing.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("csv")
@Tag(name = "csv - controller", description = "csv To DB api ")
public class CsvController {
}
