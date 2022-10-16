package Reto3y4.Servicio;

import Reto3y4.Entidad.Gama;
import Reto3y4.Repositorio.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

@Service
public class GamaService {
    @Autowired
    private GamaRepository gamaRepository;

    public List<Gama> getAll() {
        return gamaRepository.getAll();
    }

    public Gama save(Gama gama) {
        if (gama.getId() == null) {
            return gamaRepository.save(gama);
        } else {
            Optional<Gama> gama1 = gamaRepository.getGama(gama.getId());
            if (gama1.isEmpty()) {
                return gamaRepository.save(gama);
            } else {
                return gama;
            }
        }
    }

    public Gama update(Gama gama) {

        Optional<Gama> g = gamaRepository.getGama(gama.getId());
        if (!g.isEmpty()) {
            if (gama.getDescription() != null) {
                g.get().setDescription(gama.getDescription());
            }
            if (gama.getName() != null) {
                g.get().setName(gama.getName());
            }
            return gamaRepository.save(g.get());
        } else {
            return gama;
        }
    }
    public boolean deleteGama(int id){
        Boolean d= getGama(id).map(gama -> {
         gamaRepository.delete(gama);
            return true;
        }).orElse(false);
        return d;
}

    public Optional<Gama> getGama(int id) {
        return null;
    }
}



