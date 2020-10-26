package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String carsPage(@RequestParam (value = "count", required = false) Integer count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", 2000, 90));
        cars.add(new Car("Niva", 2001, 95));
        cars.add(new Car("BMW", 2010, 185));
        cars.add(new Car("Mercedes", 2019, 220));
        cars.add(new Car("Mazda", 2009, 130));


        cars = CarService.getCountCars(cars, count);

        model.addAttribute("cars", cars);

        return "cars";

    }
}
