package com.weather.forcast.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.weather.forcast.entity.WeatherData;

public interface WeatherRepository extends JpaRepository<WeatherData,Long>{
	List<WeatherData> findByDate(LocalDate date);
	 @Query("SELECT w FROM WeatherData w WHERE MONTH(w.date) = :month")
	 List<WeatherData> findByMonth(@Param("month") int month);
	 @Query("SELECT w FROM WeatherData w WHERE YEAR(w.date) = :year")
	 List<WeatherData> findByYear(@Param("year") int year);
}
