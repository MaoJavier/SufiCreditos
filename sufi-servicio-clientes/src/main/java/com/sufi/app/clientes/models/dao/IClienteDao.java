/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.clientes.models.dao;

import com.sufi.app.clientes.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jmortiz
 */
public interface IClienteDao extends CrudRepository<Cliente, Long>{
    
}
