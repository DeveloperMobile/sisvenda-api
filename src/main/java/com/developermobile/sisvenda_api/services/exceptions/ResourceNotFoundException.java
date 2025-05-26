package com.developermobile.sisvenda_api.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Registro não encontrado. Id " + id);
    }
}
