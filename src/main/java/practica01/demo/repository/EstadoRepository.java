package practica01.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import practica01.demo.entity.Estado;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Long> {
    
}
