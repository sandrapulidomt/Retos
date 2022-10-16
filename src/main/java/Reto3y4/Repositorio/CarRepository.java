package Reto3y4.Repositorio;

import Reto3y4.Entidad.Car;
import Reto3y4.Repositorio.Crud.CarCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class CarRepository {
    @Autowired
    private CarCrudRepository CrudRepository;

    public List<Car> getAll(){
        return (List<Car>) CrudRepository.findAll();
    }

    public Optional<Car> getSkate(int id){
        return CrudRepository.findById(id);
    }

    public Car save(Car car){
        return CrudRepository.save(car);
    }
    public void delete(Car car){
        CrudRepository.delete(car);
    }

    public List<Object[]> getTopByYear(){
        return CrudRepository.countTotalCarByBrand();
    }

}
