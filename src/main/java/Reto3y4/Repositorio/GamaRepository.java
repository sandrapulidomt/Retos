package Reto3y4.Repositorio;

import Reto3y4.Entidad.Gama;
import Reto3y4.Repositorio.Crud.GamaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class GamaRepository {
    @Autowired
    private GamaCrudRepository gamaCrudRepository;

    public List<Gama> getAll() {
        return (List<Gama>) gamaCrudRepository.findAll();
    }

    public Optional<Gama> getGama(int id) {
        return gamaCrudRepository.findById(id);
    }

    public Gama save(Gama gama) {
        return gamaCrudRepository.save(gama);
    }

    public void delete(Gama gama) {
        gamaCrudRepository.delete(gama);
    }
}