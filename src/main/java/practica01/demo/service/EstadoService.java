package practica01.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practica01.demo.entity.Estado;
import practica01.demo.repository.EstadoRepository;

@Service
public class EstadoService implements IEstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> getAllEstado() {
        return (List<Estado>) estadoRepository.findAll();
    }

    @Override
    public Estado getEstadoById(long id) {
        return estadoRepository.findById(id).orElse(null);

    }

    @Override
    public void saveEstado(Estado estado) {
         estadoRepository.save(estado);
    }

    @Override
    public void delete(long id) {
        estadoRepository.deleteById(id);
    }

}
