package practica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import practica.modelo.DAO.DatosDAO;
import practica.modelo.Dato;

import java.util.List;

@RestController
public class ControllerData {
    @Autowired
    private DatosDAO datosDAO;

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public List<Dato> retornaTodo() {
        return datosDAO.findAll();
    }

    @PostMapping(value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
    public void guarda(@RequestBody Dato dato) {
        datosDAO.save(dato);
    }
}
