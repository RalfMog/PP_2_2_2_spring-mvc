package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsServiceImpl implements CarsService {
    private List<Car> carList = Arrays.asList(new Car("Audi", "black", 2022),
            new Car("Mercedes-Benz", "green", 2020),
            new Car("Honda", "blue", 2000),
            new Car("Nissan", "green", 2012),
            new Car("Ford", "grey", 2017));
    @Override
    public List<Car> carsCount(int number) {
        List<Car> resultList = carList;
        if (number == 0 || number > 5) {
            return resultList;
        }
        return resultList.stream().limit(number).collect(Collectors.toList());
    }
}

