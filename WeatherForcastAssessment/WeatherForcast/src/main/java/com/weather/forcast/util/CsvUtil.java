package com.weather.forcast.util;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import org.apache.commons.csv.*;
import com.weather.forcast.entity.WeatherData;

public class CsvUtil {
	public static List<WeatherData> parse(InputStream is) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			CSVParser csvParser=new CSVParser(br, CSVFormat.DEFAULT.withFirstRecordAsHeader().withTrim());
			List<WeatherData> weather=new ArrayList<>();
			for(CSVRecord record:csvParser) {
				WeatherData data=WeatherData.builder()
				.date(LocalDate.parse(record.get("date")))
				.temperature(Double.parseDouble(record.get("temperature")))
				.humidity(Double.parseDouble(record.get("humidity")))
				.pressure(Double.parseDouble(record.get("pressure")))
				.heatIndex(Double.parseDouble(record.get("heatIndex")))
				.weatherCondition(record.get("weatherCondition"))
				.build();
				weather.add(data);
			}
			return weather;
			
		} catch (Exception e) {
			throw new RuntimeException("Failed to parse CSV file",e);
		}
	}
}
