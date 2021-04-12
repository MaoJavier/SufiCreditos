/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sufi.app.creditos.models.service;

import com.sufi.app.creditos.models.entity.Credito;
import java.util.List;

/**
 *
 * @author jmortiz
 */
public interface ICreditoService {
    public List<Credito> findAll();
    public Credito findById(Long id);
    public Credito save (Credito credito);   
    public void deleteById(Long id);
}
