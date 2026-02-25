package com.weather.forcast.dto;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class WeatherResponseDTO {
 private String weatherCondition;
 private Double temperature;
 private Double humidity;
 private Double pressure;
 private Double heatIndex;
}
