package Reto3y4.Controlador;

import Reto3y4.Controlador.Custom.StarsAmount;
import Reto3y4.Entidad.Car;
import Reto3y4.Servicio.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/car")


public class ApiCar  {
    @Autowired
    private CarService carService;
    @GetMapping("/all")
    public List<Car> getAll(){
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getRoom(@PathVariable("id") int id) {
        return carService.getCar(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Car save(@RequestBody Car car) {
        return carService.save(car);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Car update(@RequestBody Car car) {
        return carService.update(car);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return carService.delete(id);
    }

    //Report!
    @GetMapping("/report")
    public List<StarsAmount> getReport(){
        return carService.getTopCarByStars();
    }

}





