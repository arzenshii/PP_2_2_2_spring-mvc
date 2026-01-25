package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Accord", 2021));
        cars.add(new Car("Ford", "Focus", 2019));
        cars.add(new Car("BMW", "X5", 2022));
        cars.add(new Car("Mercedes", "C-Class", 2023));
    }

    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}