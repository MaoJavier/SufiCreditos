/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.productos.models.dao;

import com.sufi.app.productos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jmortiz
 */
public interface IProductoDao extends CrudRepository<Producto, Long>{
    
}
