package com.weather.forcast.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="weather_data")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate date;
	private Double temperature;
	private Double humidity;
	private Double pressure;
	private Double heatIndex;
	private String weatherCondition;
}
