package com.example.miTrivia.entities;

import com.example.miTrivia.repository.CategoryRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Data //hace getters, seters, TODO

public class TriviaController {

    @GetMapping("/categories")
    public Category[] categories() {
        Category cat = new Category();
        cat.setName("Arte");
        cat.setDescription("Me gusta el arte");
        Category cat2 = new Category();
        cat2.setName("Deportes");
        cat2.setDescription("Preguntas sobre deportes y eventos deportivos. Ejemplos: ¿Quién ganó la última Copa del Mundo de fútbol? ¿Cuál es el récord mundial de los 100 metros lisos?");
        Category[] categorias = {cat,cat2};
    return categorias;

    }
    @Autowired//inyeccion de dependencias, carga el valor de la variable con uno ya armanod
    CategoryRepository categoryRepository;

    @GetMapping("/question/{categoria}")
    public Category getQuestionAndCategory(@PathVariable String categoria) {

    List<Category> resultado =new ArrayList<>();
    Category ejeplo = categoryRepository.findById(1L);
    resultado.add(ejeplo);


    return ejeplo;
    /*Convirtiendolo en objeto:
    ObjectMapper convertidor = new ObjectMapper();
    return convertidor.convertValue(respuestaJson,Question.class);
    */
    }



}
