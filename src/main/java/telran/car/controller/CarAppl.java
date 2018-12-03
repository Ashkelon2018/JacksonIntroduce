package telran.car.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import telran.car.model.Car;

public class CarAppl {

	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Car car = mapper.readValue(new File("car.json"), Car.class);
		System.out.println(car);
		
		Car car2 = Car.builder()
					.manufacturer("Renault")
					.year(2015)
					.models(Arrays.asList("Megane","Clio"))
					.build();
		System.out.println(car2);
		
		Car car3 = Car.builder()
					.manufacturer("VW")
					.year(2017)
					.model("Polo")
					.model("Passat")
					.model("Jetta")
					.build();
		System.out.println(car3);
					
	}

}
