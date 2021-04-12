/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.clientes.controllers;

import com.sufi.app.clientes.models.entity.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.sufi.app.clientes.models.service.IClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author jmortiz
 */
@RestController
public class ClienteController {
    @Autowired
    IClienteService clienteService;
    
    @GetMapping("/listar")
    public List<Cliente> listar(){
        return clienteService.findAll();
    }  
    
    @GetMapping("/listar/id/{id}")
    public Cliente listarById(@PathVariable Long id){
        return clienteService.findById(id);
    }
    
    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente crear(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }
    
    @PutMapping("/editar/id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente editar(@RequestBody Cliente cliente,@PathVariable Long id){
        Cliente clienteDB=clienteService.findById(id);
        clienteDB.setFirstName(cliente.getFirstName());
        clienteDB.setLastName(cliente.getLastName());
        clienteDB.setEmail(cliente.getEmail());
        clienteDB.setPhone(cliente.getPhone());
        return clienteService.save(clienteDB);
    }
    
    @DeleteMapping("/eliminar/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        clienteService.deleteById(id);
    }
    
}
