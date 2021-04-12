/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.productos.models.service;

import com.sufi.app.productos.models.entity.Producto;
import java.util.List;

/**
 *
 * @author jmortiz
 */
public interface IProductoService {
    public List<Producto> findAll();
    public Producto findById(Long id);
    public Producto save (Producto cliente);   
    public void deleteById(Long id);
}
