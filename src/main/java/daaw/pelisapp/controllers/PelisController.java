package daaw.pelisapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import daaw.pelisapp.model.*;
import daaw.pelisapp.repository.PeliRepository;
import daaw.pelisapp.service.*;

@RestController
@RequestMapping("/api/pelis")
public class PelisController {
    
    @Autowired
    private PelisService pelisService;

    @Autowired
    private PeliRepository peliRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @PostMapping("/peliculas")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Pelicula pelicula){
        pelicula.setId(sequenceGeneratorService.generateSequence(Pelicula.SEQUENCE_NAME));
        pelisService.save(pelicula);
    }

    @GetMapping("/peliculas")
    public List<Pelicula> findAll(){
        return pelisService.findAll();
    }

    @GetMapping("/peliculas/{id}")
    public ResponseEntity<Optional<Pelicula>> getPeliById(@PathVariable(value = "id") Long id) {
        Optional<Pelicula> pelicula = peliRepository.findById(id);
        return ResponseEntity.ok().body(pelicula);
    }

    @DeleteMapping("/peliculas/{id}")
    public void deletebyId(@PathVariable Long id){
        pelisService.deleteByID(id);
    }

    @GetMapping("/peliculas/titulo/{titulo}")
    public Pelicula getPeliByNombre(@PathVariable("nombre") String titulo){
        Pelicula peliculaNombre = this.peliRepository.findByNombre(titulo);
        return peliculaNombre;
    }

    @GetMapping("/peliculas/actor/{actor}")
    public List<Pelicula> findByActor(String actor){
        List<Pelicula> pelisActor = this.peliRepository.findByActor(actor);
        return pelisActor;
    }


}
