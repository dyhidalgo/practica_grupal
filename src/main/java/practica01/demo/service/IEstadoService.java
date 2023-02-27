package practica01.demo.service;

import java.util.List;
import practica01.demo.entity.Estado;

public interface IEstadoService {
    
    public List<Estado> getAllEstado();
    public Estado getEstadoById(long id);
    public void saveEstado(Estado estado);
    public void delete(long id);
}
