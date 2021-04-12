/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.creditos.models.service;

import com.sufi.app.creditos.models.entity.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sufi.app.creditos.models.dao.ICreditoDao;
import com.sufi.app.creditos.clients.ClienteApiRest;
import java.util.ArrayList;
/**
 *
 * @author jmortiz
 */
@Service
public class CreditoService implements ICreditoService {
    
    @Autowired
    private ICreditoDao creditoDao;
    
    @Autowired
    private ClienteApiRest clienteApiRest;

    @Override
    @Transactional
    public Credito save(Credito credito) {
        return creditoDao.save(credito);
    }

    @Override
    @Transactional
    public void deleteById(Long id){
        creditoDao.deleteById(id);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<Credito> findAll() {
        List<Credito> creditos = new ArrayList<Credito>();
        for (Credito credito : (List<Credito>)creditoDao.findAll()) {
            credito.setClienteCredito(clienteApiRest.listarById(credito.getCliente()));
            creditos.add(credito);
        }
        return creditos;
    }

    @Override
    @Transactional(readOnly=true)
    public Credito findById(Long id) {
       Credito credito=creditoDao.findById(id).orElse(null);
       credito.setClienteCredito(clienteApiRest.listarById(credito.getCliente()));
       return credito;
    }
    
}
