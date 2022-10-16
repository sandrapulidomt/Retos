package Reto3y4.Servicio;

import Reto3y4.Controlador.Custom.StarsAmount;
import Reto3y4.Entidad.Car;
import Reto3y4.Repositorio.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class CarService {
    @Autowired
    private CarRepository carRepository;
    public List<Car> getAll() {
        return  carRepository.getAll();
    }
    public Optional<Car> gatCar(int id){
        return carRepository.getSkate(id);
    }
    public  Car save(Car car){
        if (car.getId()==null){
            return carRepository.save(car);
        }else {
            Optional<Car> e= carRepository.getSkate(car.getId());
            if (e.isEmpty()){
                return  carRepository.save(car);
            }else {
                return car;
            }
        }
    }

public Car update(Car car) {
    if (car.getId() != null) {
        Optional<Car> e = carRepository.getSkate(car.getId());
        if (!e.isEmpty()) {
            if (car.getName() != null) {
                e.get().setName(car.getName());
            }
            if (Car.getBrand() != null) {
                e.get().setBrand(car.getBrand());
            }
            if (car.getYear() != null) {
                e.get().setYear(car.getYear());
            }
            if (car.getDescription() != null) {
                e.get().setDescription(car.getDescription());
            }
            if (car.getGama() != null) {
                e.get().setGama(car.getGama());
            }
            carRepository.save(e.get());
            return e.get();
        } else {
            return car;
        }
    }


    return car;
}
    public boolean  delete(int id){
        Boolean xBoolean = gatCar(id).map(costume ->{
            carRepository.delete(costume);
            return true;
        }).orElse(false);
        return xBoolean;

    }
    public  List<StarsAmount> getTopCarByStars(){
        List<Object[]> report= carRepository.getTopByYear();
        List<StarsAmount>res= new ArrayList<>();
        for (int i=0;i<report.size();i++){
            res.add(new StarsAmount((int)report.get(i)[0],(int) report.get(i)[1]));

        }
        return res;
    }

    public Optional<Car> getCar(int id) {
        return null;
    }
}

