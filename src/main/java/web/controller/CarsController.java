package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value ="/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> resultList = new ArrayList<>();
        resultList.add(new Car("Audi", "black", 2022));
        resultList.add(new Car("Mercedes-Benz", "green", 2020));
        resultList.add(new Car("Honda", "blue", 2000));
        resultList.add(new Car("Nissan", "green", 2012));
        resultList.add(new Car("Ford", "grey", 2017));
        resultList = CarsService.carsCount(resultList, allCars);
        model.addAttribute("list", resultList);
        return "car";
    }
}

