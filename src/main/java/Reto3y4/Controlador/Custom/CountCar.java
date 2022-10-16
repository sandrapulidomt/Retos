package Reto3y4.Controlador.Custom;

import Reto3y4.Entidad.Car;

public class CountCar {
    private Long total;
    private Car skate;

    public CountCar(Long total, Car car) {
        this.total = total;
        this.skate = car;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Car getCar() {
        return skate;
    }

    public void setCar(Car car) {
        this.skate = car;
    }
}
