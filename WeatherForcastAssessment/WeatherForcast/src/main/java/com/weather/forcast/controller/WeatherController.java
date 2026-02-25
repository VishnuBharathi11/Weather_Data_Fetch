package com.weather.forcast.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.weather.forcast.dto.MonthlyTemperatureDTO;
import com.weather.forcast.dto.WeatherResponseDTO;
import com.weather.forcast.service.WeatherService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService service;

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        service.uploadCsv(file);
        return "CSV Uploaded Successfully";
    }

    @GetMapping("/date")
    public List<WeatherResponseDTO> getByDate(@RequestParam String value) {
        return service.getWeatherByDate(LocalDate.parse(value));
    }

    @GetMapping("/month")
    public List<WeatherResponseDTO> getByMonth(@RequestParam int value) {
        return service.getWeatherByMonth(value);
    }

    @GetMapping("/stats")
    public List<MonthlyTemperatureDTO> getStats(@RequestParam int year) {
        return service.getYearlyStats(year);
    }
}