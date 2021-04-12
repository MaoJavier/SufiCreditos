/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.clientes.models.service;

import com.sufi.app.clientes.models.entity.Cliente;
import java.util.List;

/**
 *
 * @author jmortiz
 */
public interface IClienteService {
    public List<Cliente> findAll();
    public Cliente findById(Long id);
    public Cliente save (Cliente cliente);   
    public void deleteById(Long id);
}
