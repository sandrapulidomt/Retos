package Reto3y4.Repositorio.Crud;

import Reto3y4.Entidad.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarCrudRepository extends CrudRepository<Car,Integer> {
    @Query("SELECT c.brand , COUNT(c.brand) from Car AS c group by c.brand order by COUNT(c.brand) DESC")
    public List<Object[]> countTotalCarByBrand();
}
