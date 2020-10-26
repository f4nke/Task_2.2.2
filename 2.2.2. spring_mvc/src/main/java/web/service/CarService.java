package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    public static List<Car> getCountCars(List<Car> list, Integer count) {
        if (count == null || count > 5) {
            return list;
        } else {
            list = list.subList(0, count);
        }
        return list;
    }
}
