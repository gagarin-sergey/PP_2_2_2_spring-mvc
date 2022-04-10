package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping()
public class CarController {

    private final CarService carService = new CarService();

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Reno",111112,"Blue"));
        carList.add(new Car("Lexus",222222,"Black"));
        carList.add(new Car("Kia",333333,"Red"));
        carList.add(new Car("Volvo",444444,"White"));
        carList.add(new Car("Lada",555555,"Brown"));
    }

    @GetMapping("/cars")
    public String  getCountCar(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("carList", carService.getCountCar(carList, count));
        return "cars";
    }
}
