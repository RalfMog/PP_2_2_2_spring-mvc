package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.dao.CarsDao;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {
    private final CarsDao carsDao;

    @Autowired
    public CarsServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> carsCount(int number) {
        return carsDao.carsCount(number);
    }
}

