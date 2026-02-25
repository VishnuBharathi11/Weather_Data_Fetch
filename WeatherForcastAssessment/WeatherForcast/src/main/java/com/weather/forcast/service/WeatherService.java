package com.weather.forcast.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.weather.forcast.dto.MonthlyTemperatureDTO;
import com.weather.forcast.dto.WeatherResponseDTO;

@Service
public interface WeatherService {
	void uploadCsv(MultipartFile file);
	List<WeatherResponseDTO> getWeatherByDate(LocalDate date);
	List<WeatherResponseDTO> getWeatherByMonth(int month);
	List<MonthlyTemperatureDTO> getYearlyStats(int year);
}
