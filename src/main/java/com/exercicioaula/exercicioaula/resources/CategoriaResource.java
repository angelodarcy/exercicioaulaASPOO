package com.exercicioaula.exercicioaula.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //Adiciona uma anotação
@RequestMapping(value = "/categorias") // Adiciona um End Point
public class CategoriaResource {

    //@GetMapping
    @RequestMapping(method = RequestMethod.GET) // Para ser uma função Rest é preciso associar á um método Request
    public String testar() {
        return "Rest está funcionando";
    }

}
