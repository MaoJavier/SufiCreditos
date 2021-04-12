/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.productos.controllers;

import com.sufi.app.productos.models.entity.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.sufi.app.productos.models.service.IProductoService;
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
public class ProductoController {
    @Autowired
    IProductoService productoService;
    
    @GetMapping("/listar")
    public List<Producto> listar(){
        return productoService.findAll();
    }  
    
    @GetMapping("/listar/id/{id}")
    public Producto listarById(@PathVariable Long id){
        return productoService.findById(id);
    }
    
    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto crear(@RequestBody Producto producto){
        return productoService.save(producto);
    }
    
    @PutMapping("/editar/id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto editar(@RequestBody Producto producto,@PathVariable Long id){
        Producto productoDB=productoService.findById(id);
        productoDB.setName(producto.getName());
        return productoService.save(productoDB);
    }
    
    @DeleteMapping("/eliminar/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        productoService.deleteById(id);
    }
    
}
