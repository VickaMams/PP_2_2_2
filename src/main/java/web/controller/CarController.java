package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

	private CarsService carsService;

	public CarController( CarsService carsService) {
		this.carsService = carsService;
	}

	@GetMapping(value = "/cars")
	public String printWelcome(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, ModelMap model) {

//		List<String> messages = new ArrayList<>();
//		messages.add("Hello!");
//		messages.add("I'm Spring MVC application");
//		messages.add("5.2.0 version by sep'19 ");
//		model.addAttribute("messages", messages);
		model.addAttribute("messages", carsService.getCars(count.intValue()));
		List<Car> cars = carsService.getCars(5);
		System.out.println(cars);
		return "cars";
	}
	
}