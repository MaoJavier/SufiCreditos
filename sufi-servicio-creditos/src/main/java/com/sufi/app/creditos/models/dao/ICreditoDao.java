/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.creditos.models.dao;

import com.sufi.app.creditos.models.entity.Credito;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jmortiz
 */
public interface ICreditoDao extends CrudRepository<Credito, Long>{
    
}
