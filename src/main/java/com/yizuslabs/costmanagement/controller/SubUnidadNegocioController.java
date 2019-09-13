package com.yizuslabs.costmanagement.controller;

import com.yizuslabs.costmanagement.model.entity.TbSubUnidadNegocio;
import com.yizuslabs.costmanagement.repository.SubUnidadNegocioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/subunidadnegocio"})
public class SubUnidadNegocioController {

    private SubUnidadNegocioRepository repository;

    SubUnidadNegocioController(SubUnidadNegocioRepository repository) {
        this.repository = repository;
    }

    //Retrieve All Contacts (GET /contacts)
    @GetMapping
    public List findAll(){
        return repository.findAll();
    }

   // Retrieve a Contact by ID (GET /contacts/{id})
   @GetMapping(path = {"/{id}"})
   public ResponseEntity<TbSubUnidadNegocio> findById(@PathVariable long id){
       return repository.findById(id)
               .map(record -> ResponseEntity.ok().body(record))
               .orElse(ResponseEntity.notFound().build());
   }


   //Create a new Contact (POST /contacts)
   @PostMapping
   public TbSubUnidadNegocio create(@RequestBody TbSubUnidadNegocio subUnidadNegocio){
       return repository.save(subUnidadNegocio);
   }

   //Update a Contact (PUT /contacts)
   @PutMapping(value="/{id}")
   public ResponseEntity<TbSubUnidadNegocio> update(@PathVariable("id") long id,
                                         @RequestBody TbSubUnidadNegocio subUnidadNegocio){
       return repository.findById(id)
               .map(record -> {
                   record.setDesSubUnidad(subUnidadNegocio.getDesSubUnidad());
                   record.setObsSubUnidad(subUnidadNegocio.getObsSubUnidad());
                   TbSubUnidadNegocio updated = repository.save(record);
                   return ResponseEntity.ok().body(updated);
               }).orElse(ResponseEntity.notFound().build());
   }

   //Remove a Contact (DELETE /contacts/{id})
   @DeleteMapping(path ={"/{id}"})
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
       return repository.findById(id)
               .map(record -> {
                   repository.deleteById(id);
                   return ResponseEntity.ok().build();
               }).orElse(ResponseEntity.notFound().build());
   }



}
