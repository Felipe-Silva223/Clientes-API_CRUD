package com.ClientesAPI.Clientes.API.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record ClienteRecordDTO(@NotBlank String name, @NotNull Long cpf, @NotNull Long cep, @NotBlank String endereco) {

    
    }
