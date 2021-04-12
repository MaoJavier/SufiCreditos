package com.sufi.app.creditos.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.sufi.app.creditos.models.entity.Cliente;

@FeignClient(name = "sufi-servicio-clientes")
public interface ClienteApiRest {

    @GetMapping("/listar")
    public List<Cliente> listar();

    @GetMapping("/listar/id/{id}")
    public Cliente listarById(@PathVariable Long id);
    

}
