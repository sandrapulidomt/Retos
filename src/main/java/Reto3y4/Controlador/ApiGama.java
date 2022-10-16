package Reto3y4.Controlador;

import Reto3y4.Entidad.Gama;
import Reto3y4.Servicio.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gama")
public class ApiGama  {
    @Autowired
    private GamaService gamaService;
    @GetMapping("/all")
    public List<Gama> getAll(){
        return gamaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Gama> getCategory(@PathVariable("id") int id) {
        return gamaService.getGama(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Gama save(@RequestBody Gama gama) {
        return gamaService.save(gama);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Gama update(@RequestBody Gama gama) {
        return gamaService.update(gama);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int gamaId) {
        return gamaService.deleteGama(gamaId);
    }



}
