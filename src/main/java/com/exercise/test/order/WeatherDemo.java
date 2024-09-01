package com.exercise.test.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class WeatherDemo {

	public void whater() {
		List<Weather> weathers = new ArrayList<>();
		weathers.add(new Weather("Sunny", 33.0));
		weathers.add(new Weather("Rainy", 17.0));
		weathers.add(new Weather("Cloudy", 23.0));
		weathers.add(new Weather("Cold", 3.0));
		weathers.add(new Weather("Hot", 37.0));
		weathers.add(new Weather("Windy", 13.0));
		weathers.add(new Weather("Snowy", 0.0));
		weathers.add(new Weather("Freezing", -15.0));
		
		//order by temperature
		weathers.stream()
	       .sorted(Comparator.comparing(Weather::getTemperature))
	       .forEach(System.out::println);
	}
}
