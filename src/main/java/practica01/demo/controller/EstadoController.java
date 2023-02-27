package practica01.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import practica01.demo.entity.Estado;
import practica01.demo.service.IEstadoService;

@Controller
public class EstadoController {

    @Autowired
    private IEstadoService estadoService;

    @GetMapping("/")
    public String index(Model model) {
        List<Estado> listaEstado = estadoService.getAllEstado();
        model.addAttribute("titulo", "Tabla Estados");
        model.addAttribute("estado", listaEstado);
        return "estado";
    }
}
