package com.example.miTrivia.repository;

import com.example.miTrivia.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
//indica al freamework q nos conectamos a la base de datos, se usa en todos los repository:
@Repository
@Transactional

//conecta a la base de datos a la tabla category
public class CategoryRepository {

    @PersistenceContext
EntityManager conexionBaseDeDatos;//EntityManager es un tipo de dato que nos permite conectarnos a la base de datos<
    //nos busca categoria por el id
    public Category findById(Long id){
        return conexionBaseDeDatos.find(Category.class,id);//ya biene con este tipo de dato
    }




}
