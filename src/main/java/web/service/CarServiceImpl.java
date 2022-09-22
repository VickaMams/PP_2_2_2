package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarsService{

    private CarDao carDao =new CarDaoImpl();

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
    @Override
    public void setCars(){
         carDao.setCars();
    }
}
