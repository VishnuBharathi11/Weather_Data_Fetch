package com.weather.forcast.dto;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class MonthlyTemperatureDTO {
	private int month;
    private Double minTemperature;
    private Double maxTemperature;
    private Double medianTemperature;
}
