package Reto3y4.Repositorio.Crud;

import Reto3y4.Entidad.Admin;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.repository.CrudRepository;

public interface AdminCrudRepository extends CrudRepository<Admin,Integer> {
}
