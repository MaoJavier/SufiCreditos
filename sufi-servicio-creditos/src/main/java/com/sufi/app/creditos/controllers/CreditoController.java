/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.creditos.controllers;

import com.sufi.app.creditos.models.entity.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.sufi.app.creditos.models.service.ICreditoService;

/**
 *
 * @author jmortiz
 */
@RestController
public class CreditoController {
    @Autowired
    ICreditoService creditoService;
    
    @GetMapping("/listar")
    public List<Credito> listar(){
        return creditoService.findAll();
    }  
    
    @GetMapping("/listar/id/{id}")
    public Credito listarById(@PathVariable Long id){
        return creditoService.findById(id);
    }
    
    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Credito crear(@RequestBody Credito cliente){
        return creditoService.save(cliente);
    }
    
   
    @DeleteMapping("/eliminar/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        creditoService.deleteById(id);
    }
    
}
