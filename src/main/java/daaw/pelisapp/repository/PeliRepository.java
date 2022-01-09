package daaw.pelisapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import daaw.pelisapp.model.Pelicula;

@Repository
public interface PeliRepository extends MongoRepository<Pelicula, Long>{ //al extender de MongoRepository tiene todos los métodos predeterminados, como save, findAll...
    
    Pelicula findByNombre(String titulo);

    @Query(value = "{listaActores:?0")
    List<Pelicula> findByActor(String actor);
}
