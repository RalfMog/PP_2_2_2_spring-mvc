package web.dao;

import web.model.Car;

import java.util.List;

public interface CarsDao {

    public List<Car> carsCount(int number);
}
