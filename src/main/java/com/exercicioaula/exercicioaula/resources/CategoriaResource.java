package com.exercicioaula.exercicioaula.resources;

import com.exercicioaula.exercicioaula.damain.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //Adiciona uma anotação
@RequestMapping(value = "/categorias") // Adiciona um End Point
public class CategoriaResource {

    //@GetMapping
    @RequestMapping(method = RequestMethod.GET) // Para ser uma função Rest é preciso associar á um método Request
    public List<Categoria> listar() {

        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritório");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);

        return lista;
    }

}
