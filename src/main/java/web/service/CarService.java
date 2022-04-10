package web.service;

import web.model.Car;

import java.util.List;

public class CarService {

    public static List<Car> getCountCar(List<Car> carList, int count) {
        return carList.stream().limit(count).toList();
    }
}
