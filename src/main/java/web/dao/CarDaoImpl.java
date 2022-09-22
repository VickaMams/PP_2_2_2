package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> cars= new ArrayList<>();

    public void CarDaoImpl(){

    }


    @Override
    public List<Car> getCars(int count) {
        List <Car> getCarsList = cars;
        if (count < 5) {
            getCarsList = cars.stream().limit(count).toList();
        }
        return getCarsList;
    }
    @Override
    public void setCars() {
        cars.add(new Car("Bugatti", 1, 10));
        cars.add(new Car("Lamborgini", 2, 5));
        cars.add(new Car("Porshe", 911, 13));
        cars.add(new Car("Doge", 28, 20));
        cars.add(new Car("Lada", 115, 15));
    }
}
