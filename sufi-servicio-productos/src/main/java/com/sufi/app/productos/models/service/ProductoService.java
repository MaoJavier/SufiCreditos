/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.productos.models.service;

import com.sufi.app.productos.models.dao.IProductoDao;
import com.sufi.app.productos.models.entity.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jmortiz
 */
@Service
public class ProductoService implements IProductoService {
    
    @Autowired
    private IProductoDao productoDao;

    @Override
    @Transactional
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }

    @Override
    @Transactional
    public void deleteById(Long id){
        productoDao.deleteById(id);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<Producto> findAll() {
        return (List<Producto>)productoDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }
    
}
