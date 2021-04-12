/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.clientes.models.service;

import com.sufi.app.clientes.models.dao.IClienteDao;
import com.sufi.app.clientes.models.entity.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jmortiz
 */
@Service
public class ClienteService implements IClienteService {
    
    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void deleteById(Long id){
        clienteDao.deleteById(id);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<Cliente> findAll() {
        return (List<Cliente>)clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }
    
}
