package com.ClientesAPI.Clientes.API.Repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ClientesAPI.Clientes.API.Model.ClienteModel;


public interface ClienteRepository extends JpaRepository <ClienteModel, UUID>{
    
}
