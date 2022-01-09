package daaw.pelisapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import daaw.pelisapp.repository.PeliRepository;
import daaw.pelisapp.model.Pelicula;

@Service
public class PelisService {
    
    @Autowired
    private PeliRepository peliRepository;

    public void save(Pelicula pelicula){
        peliRepository.save(pelicula);
        
    }

    public List<Pelicula> findAll(){
        return peliRepository.findAll();
    } 

    public Optional<Pelicula> findbyID(long id){
        return peliRepository.findById(id);
    }
/*
    public List<Pelicula> findByActor(String actor){
        List<Pelicula> listaPeliculasActor;
        return listaPeliculasActor;
        
    }
*/
    public void deleteByID(Long id){
        peliRepository.deleteById(id);
    }
}
